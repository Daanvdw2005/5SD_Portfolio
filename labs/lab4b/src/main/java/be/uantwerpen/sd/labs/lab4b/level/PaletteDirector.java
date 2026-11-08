package be.uantwerpen.sd.labs.lab4b.level;

public final class PaletteDirector {
    public static Palette construct(PaletteBuilder b) {
        /*
            TODO: Implement this method.
            TIP: It should call every method of the builder and then return the build object.
        */
        b.buildBackground();
        b.buildFloor();
        b.buildWall();
        b.buildTarget();
        b.buildPlayer();
        b.buildBox();
        return b.build();
    }
}
