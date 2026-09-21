package B_abstractfactory;
import B_abstractfactory.forest.*;

public class ForestWorldFactory implements WorldFactory {
    @Override public Enemy createEnemy() { return new ForestEnemy(); }
    @Override public Terrain createTerrain() { return new ForestTerrain(); }
    @Override public Soundtrack createSoundtrack() { return new ForestSoundTrack(); }
}