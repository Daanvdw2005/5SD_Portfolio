package be.uantwerpen.sd.labs.lab2.classdiagrams.interfaces;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    public void run() {

        /*
            TODO: Create a UniversalRemote and add multiple devices (TV, Radio, CDPlayer). Call lowerVolume() and riseVolume() to verify polymorphism.
            TIP: Upcast to VolumeDevice when storing devices; verify that methods dispatch correctly.
        */
        UniversalRemote remote = new UniversalRemote();

        TV tv = new TV(10);
        Radio radio = new Radio(5);
        CdPlayer cdPlayer = new CdPlayer(20);

        remote.addDevice(tv);
        remote.addDevice(radio);
        remote.addDevice(cdPlayer);

        System.out.println("Voor volume wijziging:");
        System.out.println("TV: " + tv.getVolume() + ", Radio: " + radio.getVolume() + ", CD: " + cdPlayer.getVolume());

        remote.raiseVolume();
        System.out.println("Na volume omhoog:");
        System.out.println("TV: " + tv.getVolume() + ", Radio: " + radio.getVolume() + ", CD: " + cdPlayer.getVolume());

        remote.lowerVolume();
        System.out.println("Na volume omlaag:");
        System.out.println("TV: " + tv.getVolume() + ", Radio: " + radio.getVolume() + ", CD: " + cdPlayer.getVolume());
    }
}
