package be.uantwerpen.sd.labs.lab3.inventory;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
TODO: Create a **thread‑safe** Singleton inventory DB; fire 'stockChanged' when a product stock is updated.
Fields you will need:
  - InventoryDB INSTANCE
Methods you will implement:
  - InventoryDB getInstance()
  - void setStock(String sku, int newQty)
TIP: Use private static volatile INSTANCE; implement double‑checked locking in getInstance(); fire 'stockChanged' with old and new stock.
*/
public class InventoryDB extends Database {
    private final Map<String, Integer> stock = new ConcurrentHashMap<>(); // sku -> qty
    private static volatile InventoryDB INSTANCE;

    private InventoryDB() { }

    public static InventoryDB getInstance() {
        /*
            TODO: Return the Singleton instance using double‑checked locking.
            TIP: Check null before and inside a synchronized block.
        */
        if (INSTANCE == null) {
            synchronized (InventoryDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = new InventoryDB();
                }
            }
        }
        return INSTANCE;
    }

    public void setStock(String sku, int newQty) {
        /*
            TODO: Set stock for a sku and notify observers.
            TIP: Read old value, put new value, then notify with event name 'stockChanged'.
        */
        Integer previous = stock.put(sku, newQty);
        int oldQty = (previous == null) ? 0 : previous;
        notifyObservers("stockChanged", oldQty, newQty);
    }

    public int getStock(String sku) {
        return stock.getOrDefault(sku, 0);
    }
}