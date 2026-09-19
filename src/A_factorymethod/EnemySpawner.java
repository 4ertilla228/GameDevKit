package A_factorymethod;

public abstract class EnemySpawner {

    // абстрактный фабричный метод, который должны реализовать подклассы
    public abstract Enemy createEnemy();

    // бизнес
    public void spawnAndAttack() {
        System.out.println("--- Система спавна активирована ---");
        // делегируем создание объекта фабричному методу
        Enemy enemy = createEnemy();
        // используем продукт
        enemy.attack();
    }
}