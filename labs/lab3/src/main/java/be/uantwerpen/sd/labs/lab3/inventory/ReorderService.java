package be.uantwerpen.sd.labs.lab3.inventory;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

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
