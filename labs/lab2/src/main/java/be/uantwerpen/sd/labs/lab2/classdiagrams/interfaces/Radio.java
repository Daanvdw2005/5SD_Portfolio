package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;


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
