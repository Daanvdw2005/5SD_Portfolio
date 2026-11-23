package be.uantwerpen.sd.labs.lab4b.level;

import be.uantwerpen.sd.labs.lab4b.gen.WorldGenerator;
import be.uantwerpen.sd.labs.lab4b.logic.CoveragePolicy;
import be.uantwerpen.sd.labs.lab4b.logic.MovementStrategy;
import be.uantwerpen.sd.labs.lab4b.model.domain.Box;
import be.uantwerpen.sd.labs.lab4b.model.domain.GroundTile;
import be.uantwerpen.sd.labs.lab4b.model.domain.Player;
/**
 * Abstract Factory: creates a whole family of related objects for one game mode.
 * WarehouseKit and GlacierKit each create a matching set (movement, generator,
 * tiles, entities, coverage rule, palette).
 */
public abstract class LevelKit {

    public String name() {
        return getClass().getSimpleName().replace("Kit", "");
    }

    public interface RendererHints {
        boolean showSelectionOverlay();
    }

    public Palette palette() {
        return PaletteDirector.construct(paletteBuilder());
    }

    public abstract MovementStrategy movement();

    public abstract WorldGenerator generator();

    public abstract RendererHints hints();

    public abstract Level level();

    public abstract GroundTile floor();

    public abstract GroundTile wall();

    public abstract GroundTile target();

    public abstract Box box();

    public abstract Player player();

    public abstract CoveragePolicy coverage();

    public abstract PaletteBuilder paletteBuilder();

}
