package be.uantwerpen.sd.labs.lab4b.logic;

import be.uantwerpen.sd.labs.lab4b.model.domain.Entity;
/*
TODO: Implement the abstract class CoveragePolicy.
TIP: This class shouldn't contain an actual implementation. Everything should be abstract.
*/
public abstract class CoveragePolicy {
    /*
		TODO: Something about this method declaration needs to be changed.
		TIP: What type of class should this be?
	*/
    public abstract boolean countsForCoverage(Entity e);
}