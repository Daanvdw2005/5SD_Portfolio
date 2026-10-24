package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;

/*
TODO: Implement CDPlayer as a concrete VolumeDevice.
Fields you will need:
  - int volume
Methods you will implement:
  - void volumeUp()
  - void volumeDown()
TIP: Keep an internal volume (e.g., int) and print state changes in volumeUp()/volumeDown().
*/
public class CdPlayer implements VolumeDevice{
    private int volume;

    public CdPlayer(int initialVolume) {
        this.volume = initialVolume;
    }

    public CdPlayer() {
        this(15);
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