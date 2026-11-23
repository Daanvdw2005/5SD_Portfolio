package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;


public class TV implements VolumeDevice {

    private int volume;

    public TV(int initialVolume) {
        this.volume = initialVolume;
    }

    public TV() {
        this(10);
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
