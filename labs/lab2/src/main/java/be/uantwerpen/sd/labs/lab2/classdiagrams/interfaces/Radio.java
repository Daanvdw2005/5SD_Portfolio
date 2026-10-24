package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;

/*
TODO: Implement Radio as a concrete VolumeDevice.
Fields you will need:
  - int volume
Methods you will implement:
  - void volumeUp()
  - void volumeDown()
TIP: Keep an internal volume (e.g., int) and print state changes in volumeUp()/volumeDown().
*/
public class Radio implements VolumeDevice {
    private int volume;

    public Radio(int initialVolume) {
        this.volume = initialVolume;
    }

    public Radio() {
        this(5);
    }

    @Override
    public void volumeUp() {
        volume++;
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }
}
