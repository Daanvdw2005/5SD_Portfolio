package be.uantwerpen.sd.labs.lab4b.level;

/*
TODO: Implement the abstract class for the PaletteBuilder.
TIP: This class should be abstract, PaletteDirector should extend this class and contain the actual implementations of these methods.
*/
public abstract class PaletteBuilder {
    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract  void buildBackground();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract  void buildFloor();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract  void buildWall();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract  void buildTarget();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract  void buildPlayer();


    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract  void buildBox();

    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract Palette build() ;
}
