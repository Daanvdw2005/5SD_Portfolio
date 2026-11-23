package be.uantwerpen.sd.labs.lab4b.logic;

import be.uantwerpen.sd.labs.lab4b.model.domain.Entity;
public abstract class CoveragePolicy {
    public abstract boolean countsForCoverage(Entity e);
}