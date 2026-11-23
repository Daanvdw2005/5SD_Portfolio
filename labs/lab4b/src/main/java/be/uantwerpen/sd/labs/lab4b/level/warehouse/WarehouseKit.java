package be.uantwerpen.sd.labs.lab4b.level.warehouse;

import be.uantwerpen.sd.labs.lab4b.config.AppConfig;
import be.uantwerpen.sd.labs.lab4b.gen.WarehouseWorldGenerator;
import be.uantwerpen.sd.labs.lab4b.gen.WorldGenerator;
import be.uantwerpen.sd.labs.lab4b.level.Level;
import be.uantwerpen.sd.labs.lab4b.level.LevelKit;
import be.uantwerpen.sd.labs.lab4b.level.PaletteBuilder;
import be.uantwerpen.sd.labs.lab4b.level.ThemedPaletteBuilder;
import be.uantwerpen.sd.labs.lab4b.logic.CoveragePolicy;
import be.uantwerpen.sd.labs.lab4b.logic.MovementStrategy;
import be.uantwerpen.sd.labs.lab4b.logic.warehouse.WarehouseCoveragePolicy;
import be.uantwerpen.sd.labs.lab4b.logic.warehouse.WarehouseMovementStrategy;
import be.uantwerpen.sd.labs.lab4b.model.domain.Box;
import be.uantwerpen.sd.labs.lab4b.model.domain.GroundTile;
import be.uantwerpen.sd.labs.lab4b.model.domain.Player;
import be.uantwerpen.sd.labs.lab4b.model.domain.warehouse.*;
public final class WarehouseKit extends LevelKit {

    private WarehouseKit() {
    }

    public static LevelKit createLevelKit() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        static final LevelKit INSTANCE = new WarehouseKit();
    }

    @Override
    public RendererHints hints() {
        return () -> false;
    }

    public MovementStrategy movement() {
        return new WarehouseMovementStrategy();
    }

    public WorldGenerator generator() {
        return new WarehouseWorldGenerator();
    }

    public Level level() {
        return new WarehouseLevel();
    }

    public GroundTile floor() {
        return new WarehouseFloor();
    }

    public GroundTile wall() {
        return new WarehouseWall();
    }

    public GroundTile target() {
        return new WarehouseTarget();
    }

    public Box box() {
        return new WarehouseBox();
    }

    public Player player() {
        return new WarehousePlayer();
    }

    public CoveragePolicy coverage() {
        return new WarehouseCoveragePolicy();
    }

    public PaletteBuilder paletteBuilder() {
        return new ThemedPaletteBuilder(AppConfig.get().themeWarehouse);
    }

}
