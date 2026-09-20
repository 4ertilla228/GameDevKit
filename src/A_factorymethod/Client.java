package A_factorymethod;

public class Client {
    public static void main(String[] args) {
        // Мы работаем только с создателями (Spawners).
        // Клиент не знает и не должен знать, как именно создаются Goblin или Slime.

        EnemySpawner goblinCave = new GoblinSpawner();
        EnemySpawner graveyard = new SkeletonSpawner();
        EnemySpawner swamp = new SlimeSpawner();

        // Вызываем бизнес-логику. Создатели сами решат, кого спавнить.
        goblinCave.spawnAndAttack();
        graveyard.spawnAndAttack();
        swamp.spawnAndAttack();
    }
}