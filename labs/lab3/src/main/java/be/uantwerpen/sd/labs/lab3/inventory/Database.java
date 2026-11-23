package be.uantwerpen.sd.labs.lab3.inventory;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class Database {
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void addListener(PropertyChangeListener l) {
        pcs.addPropertyChangeListener(l);
    }

    public void removeListener(PropertyChangeListener l) {
        pcs.removePropertyChangeListener(l);
    }

    protected void notifyObservers(String event, Object oldV, Object newV) {
        pcs.firePropertyChange(event, oldV, newV);
    }
}
