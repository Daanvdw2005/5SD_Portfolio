package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;


import java.util.ArrayList;
import java.util.List;

/*
TODO: Maintain an internal collection of VolumeDevice. Implement addDevice(VolumeDevice), lowerVolume(), and riseVolume().
Fields you will need:
  - List<VolumeDevice> devices
Methods you will implement:
  - void addDevice(VolumeDevice device)
  - void lowerVolume()
  - void riseVolume()
TIP: lowerVolume() should call volumeDown() on each device; riseVolume() should call volumeUp() on each device.
*/
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