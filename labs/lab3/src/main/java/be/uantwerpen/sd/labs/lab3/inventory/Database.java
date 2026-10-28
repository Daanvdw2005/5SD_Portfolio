package be.uantwerpen.sd.labs.lab3.inventory;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/*
TODO: Use PropertyChangeSupport to implement the Subject role.
Fields you will need:
  - PropertyChangeSupport pcs
Methods you will implement:
  - void addListener(PropertyChangeListener l)
  - void removeListener(PropertyChangeListener l)
  - void notifyObservers(String event, Object oldV, Object newV)
TIP: Hold a PropertyChangeSupport; expose add/remove; a protected notify helper is handy.
*/
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
