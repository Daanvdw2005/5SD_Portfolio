package be.uantwerpen.sd.labs.lab4a;


import java.util.Locale;

public abstract class ReforestationPlanner {

    protected abstract Plant createPlant();

    public PlantingPlan plan(double hectares, String soil) {
        Plant plant = createPlant();
        double spacing = Math.max(plant.spacingMeters(), soilAdjustment(soil));
        int count = (int) Math.round((hectares * 10_000.0) / (spacing * spacing));
        String note = "Plant " + count + " × " + plant.info() + " on " + hectares + " ha (soil=" + soil + ")";
        return new PlantingPlan(plant, count, spacing, note);
    }

    private double soilAdjustment(String soil) {
        String s = soil.toLowerCase(Locale.ROOT);
        if (s.contains("sandy")) return 2.5;
        if (s.contains("clay")) return 3.0;
        if (s.contains("wet") || s.contains("saline")) return 2.0;
        return 2.0;
    }


}

