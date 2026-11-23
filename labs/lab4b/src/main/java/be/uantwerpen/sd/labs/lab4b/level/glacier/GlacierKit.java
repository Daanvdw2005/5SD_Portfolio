package be.uantwerpen.sd.labs.lab4b.level.glacier;

import be.uantwerpen.sd.labs.lab4b.config.AppConfig;
import be.uantwerpen.sd.labs.lab4b.gen.GlacierWorldGenerator;
import be.uantwerpen.sd.labs.lab4b.gen.WorldGenerator;
import be.uantwerpen.sd.labs.lab4b.level.Level;
import be.uantwerpen.sd.labs.lab4b.level.LevelKit;
import be.uantwerpen.sd.labs.lab4b.level.PaletteBuilder;
import be.uantwerpen.sd.labs.lab4b.level.ThemedPaletteBuilder;
import be.uantwerpen.sd.labs.lab4b.logic.CoveragePolicy;
import be.uantwerpen.sd.labs.lab4b.logic.MovementStrategy;
import be.uantwerpen.sd.labs.lab4b.logic.glacier.GlacierCoveragePolicy;
import be.uantwerpen.sd.labs.lab4b.logic.glacier.GlacierMovementStrategy;
import be.uantwerpen.sd.labs.lab4b.model.domain.Box;
import be.uantwerpen.sd.labs.lab4b.model.domain.GroundTile;
import be.uantwerpen.sd.labs.lab4b.model.domain.Player;
import be.uantwerpen.sd.labs.lab4b.model.domain.glacier.*;
public final class GlacierKit extends LevelKit {

    @Override
    public RendererHints hints() {
        return () -> true;
    }

    private GlacierKit() {
    }

    public static LevelKit createLevelKit() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        static final LevelKit INSTANCE = new GlacierKit();
    }

    public MovementStrategy movement() {
        return new GlacierMovementStrategy(this);
    }

    public WorldGenerator generator() {
        return new GlacierWorldGenerator();
    }

    public Level level() {
        return new GlacierLevel();
    }

    public GroundTile floor() {
        return new GlacierFloor();
    }

    public GroundTile wall() {
        return new GlacierWall();
    }

    public GroundTile target() {
        return new GlacierTarget();
    }

    public Box box() {
        return new GlacierBox();
    }

    public Player player() {
        return new GlacierPlayer();
    }

    public CoveragePolicy coverage() {
        return new GlacierCoveragePolicy();
    }

    public PaletteBuilder paletteBuilder() {
        return new ThemedPaletteBuilder(AppConfig.get().themeGlacier);
    }
}
