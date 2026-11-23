package be.uantwerpen.sd.labs.lab3.inventory;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InventoryDB extends Database {
    private final Map<String, Integer> stock = new ConcurrentHashMap<>(); // sku -> qty
    private static volatile InventoryDB INSTANCE;

    private InventoryDB() { }

    public static InventoryDB getInstance() {
        if (INSTANCE ==  null) {
            synchronized (InventoryDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = new InventoryDB();
                }
            }
        }
        return INSTANCE;
    }

    public void setStock(String sku, int newQty) {
        Integer oldQty = stock.put(sku, newQty);
        notifyObservers("stockChanged", oldQty, newQty);
    }

    public int getStock(String sku) {
        return stock.getOrDefault(sku, 0);
    }
}