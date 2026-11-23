package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniversalRemoteITest {

    @Test
    void testRaiseVolumeAllDevices() {
        UniversalRemote remote = new UniversalRemote();
        TV tv = new TV(10);
        Radio radio = new Radio(5);

        remote.addDevice(tv);
        remote.addDevice(radio);

        remote.raiseVolume();

        assertEquals(11, tv.getVolume());
        assertEquals(6, radio.getVolume());
    }

    @Test
    void testLowerVolumeAllDevices() {
        UniversalRemote remote = new UniversalRemote();
        TV tv = new TV(10);
        CDPlayer cDPlayer = new CDPlayer(8);

        remote.addDevice(tv);
        remote.addDevice(cDPlayer);

        remote.lowerVolume();

        assertEquals(9, tv.getVolume());
        assertEquals(7, cDPlayer.getVolume());
    }

    @Test
    void testVolumeDoesNotGoBelowZero() {
        TV tv = new TV(0);
        tv.volumeDown();
        assertEquals(0, tv.getVolume());
    }
}