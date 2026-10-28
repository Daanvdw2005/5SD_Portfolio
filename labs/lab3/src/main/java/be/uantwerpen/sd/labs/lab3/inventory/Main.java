package be.uantwerpen.sd.labs.lab3.inventory;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        /*
            TODO: Obtain the thread‑safe Singleton DB, register listeners, and adjust stock to see events.
            TIP: Use two events, one where the quantity is below the threshold to reorder.
        */
//        tijdelijke test na integratie van Database & InventoryDB
//        InventoryDB a = InventoryDB.getInstance();
//        InventoryDB b = InventoryDB.getInstance();
//        System.out.println(a == b);

        InventoryDB db = InventoryDB.getInstance();
        db.addListener(new AuditLogger());
        db.addListener(new ReorderService(3));

        Controller controller = new Controller(db);
        controller.adjust("SKU-1", 10);  // above trigger
        controller.adjust("SKU-1", 5);   // below trigger
        controller.adjust("SKU-1", 2);
    }
}
