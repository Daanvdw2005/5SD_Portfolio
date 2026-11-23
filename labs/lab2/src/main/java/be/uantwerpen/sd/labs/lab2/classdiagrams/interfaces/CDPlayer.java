package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;


public class CDPlayer implements VolumeDevice{
    private int volume;

    public CDPlayer(int initialVolume) {
        this.volume = initialVolume;
    }

    public CDPlayer() {
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