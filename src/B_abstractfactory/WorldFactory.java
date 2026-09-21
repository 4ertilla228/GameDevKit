package B_abstractfactory;

public interface WorldFactory {
    Enemy createEnemy();
    Terrain createTerrain();
    Soundtrack createSoundtrack();
}