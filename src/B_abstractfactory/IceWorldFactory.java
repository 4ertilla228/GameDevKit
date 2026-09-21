package B_abstractfactory;

import B_abstractfactory.ice.*;

public class IceWorldFactory implements WorldFactory {
    @Override public Enemy createEnemy() { return new IceEnemy(); }
    @Override public Terrain createTerrain() { return new IceTerrain(); }
    @Override public Soundtrack createSoundtrack() { return new IceSoundtrack(); }
}