package be.uantwerpen.sd.labs.lab3.inventory;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
TODO: Trigger a reorder when stock dips below a threshold.
Fields you will need:
  - int threshold
Methods you will implement:
  - void propertyChange(PropertyChangeEvent evt)
TIP: Choose a small threshold like 3 for demo. Don't forget to implement the correct Class. In your message use at least `REORDER:` and the quantity.
*/
public class ReorderService implements PropertyChangeListener{
    private final int threshold;

    public ReorderService(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("stockChanged".equals(evt.getPropertyName())) {
            int newQty = (Integer) evt.getNewValue();
            if (newQty < threshold) {
                System.out.println("REORDER: quantity is " + newQty);
            }
        }
    }
}
