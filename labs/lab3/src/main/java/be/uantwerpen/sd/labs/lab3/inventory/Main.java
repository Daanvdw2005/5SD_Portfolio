package be.uantwerpen.sd.labs.lab3.inventory;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        InventoryDB db = InventoryDB.getInstance();
        db.addListener(new AuditLogger());
        db.addListener(new ReorderService(3));

        Controller controller = new Controller(db);
        controller.adjust("SKU-1", 10);  // above trigger
        controller.adjust("SKU-1", 5);   // below trigger
        controller.adjust("SKU-1", 2);
    }
}
