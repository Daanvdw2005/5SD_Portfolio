package be.uantwerpen.sd.labs.lab3.inventory;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AuditLogger implements PropertyChangeListener{
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("stockChanged".equals(evt.getPropertyName())) {
            System.out.println("AUDIT: new quantity " + evt.getNewValue());
        }
    }
}
