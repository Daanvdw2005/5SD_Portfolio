package be.uantwerpen.sd.labs.lab4b.level;

public abstract class PaletteBuilder {
    public abstract  void buildBackground();

    public abstract  void buildFloor();

    public abstract  void buildWall();

    public abstract  void buildTarget();

    public abstract  void buildPlayer();


    public abstract  void buildBox();

    public abstract Palette build() ;
}
