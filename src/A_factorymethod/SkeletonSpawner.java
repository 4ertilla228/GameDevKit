package A_factorymethod;

public class SkeletonSpawner extends EnemySpawner {
    @Override
    public Enemy createEnemy() {
        return new Skeleton();
    }
}