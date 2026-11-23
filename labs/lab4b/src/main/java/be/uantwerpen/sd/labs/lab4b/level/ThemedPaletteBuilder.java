package be.uantwerpen.sd.labs.lab4b.level;

import javafx.scene.paint.Color;

import java.util.Map;

public final class ThemedPaletteBuilder extends PaletteBuilder {
    private Color background, floor, wall, target, player, box;
    private final Map<String, String> theme;

    public ThemedPaletteBuilder(Map<String, String> theme) {
        this.theme = theme;
    }

    private static Color c(String hex) {
        return Color.web(hex);
    }

    @Override public void buildBackground() { background = c(theme.get("background")); }
    @Override public void buildFloor()      { floor      = c(theme.get("floor")); }
    @Override public void buildWall()       { wall       = c(theme.get("wall")); }
    @Override public void buildTarget()     { target     = c(theme.get("target")); }
    @Override public void buildPlayer()     { player     = c(theme.get("player")); }
    @Override public void buildBox()        { box        = c(theme.get("box")); }

    @Override
    public Palette build() {
        return new Palette(background, floor, wall, target, player, box);
    }
}