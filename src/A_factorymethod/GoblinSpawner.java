package A_factorymethod;

public class GoblinSpawner extends EnemySpawner {
    @Override
    public Enemy createEnemy() {
        return new Goblin();
    }
}