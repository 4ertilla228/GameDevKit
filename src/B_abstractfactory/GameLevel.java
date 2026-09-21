package B_abstractfactory;

public class GameLevel {
    private Enemy enemy;
    private Terrain terrain;
    private Soundtrack soundtrack;

    public  GameLevel(WorldFactory factory) {
        this.enemy = factory.createEnemy();
        this.terrain = factory.createTerrain();
        this.soundtrack = factory.createSoundtrack();
    }
    public void startLevel(){
        System.out.println("——— Уровень загружается ———");
        terrain.render();
        soundtrack.play();
        System.out.println("Враг появляется");
        enemy.attack();
    }
}
