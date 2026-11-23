package be.uantwerpen.sd.labs.lab4b.level;

public final class PaletteDirector {
    public static Palette construct(PaletteBuilder b) {
        b.buildBackground();
        b.buildFloor();
        b.buildWall();
        b.buildTarget();
        b.buildPlayer();
        b.buildBox();
        return b.build();
    }
}
