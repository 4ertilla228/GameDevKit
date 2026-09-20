package A_factorymethod;

public abstract class EnemySpawner {

    // абстрактный фабричный метод, который должны реализовать подклассы
    public abstract Enemy createEnemy();

    // бизнес
    public void spawnAndAttack() {
        System.out.println("——— Система спавна активирована ———");
        // передаём задачи создание объекта фабричному методу
        Enemy enemy = createEnemy();
        // используем продукт
        enemy.attack();
    }
}