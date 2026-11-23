package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;


import java.util.ArrayList;
import java.util.List;


class UniversalRemote {
    private final List<VolumeDevice> devices;

    public UniversalRemote() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(VolumeDevice device) {
        if (device != null) {
            devices.add(device);
        }
    }

    public void raiseVolume() {
        for (VolumeDevice device : devices) {
            device.volumeUp();
        }
    }

    public void lowerVolume() {
        for (VolumeDevice device : devices) {
            device.volumeDown();
        }
    }

    public List<VolumeDevice> getDevices() {
        return devices;
    }
}