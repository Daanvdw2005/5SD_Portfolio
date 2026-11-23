package be.uantwerpen.sd.labs.lab4a.plants;

import be.uantwerpen.sd.labs.lab4a.Plant;
public class Willow implements Plant{
    @Override
    public String commonName() {
        return "Willow";
    }

    public double spacingMeters() {
        return 2.5;
    }

    public String soilPreference() {
        return "wet";
    }
}

