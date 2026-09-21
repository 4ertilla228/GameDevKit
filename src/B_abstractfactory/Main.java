package B_abstractfactory;

public class Main {
    public static void main(String[] args) {
        // Семейство выбирается в одном месте.
        // Если захотим сменить весь мир на ледяной, поменяем ТОЛЬКО эту строчку.
        WorldFactory currentFactory = new IceWorldFactory();

        // Клиент получает фабрику и работает с ней
        GameLevel level = new GameLevel(currentFactory);
        level.startLevel();
    }
}