package B_abstractfactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorldFactory factory;

        System.out.println("Добро пожаловать в Game World Kit!");
        System.out.println("Выберите уровень для загрузки:");
        System.out.println("1 - Лесной мир (Forest)");
        System.out.println("2 - Ледяной мир (Ice)");
        System.out.println("3 - Пустынный мир (Desert)");
        System.out.print("Ваш выбор: ");

        // Читаем ввод пользователя
        int choice;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            choice = -1; // Обработка неверного ввода (если ввели буквы)
        }

        // Выбор фабрики происходит ровно в одном месте программы
        switch (choice) {
            case 1:
                System.out.println("Инициализация Лесной фабрики...");
                factory = new ForestWorldFactory();
                break;
            case 2:
                System.out.println("Инициализация Ледяной фабрики...");
                factory = new IceWorldFactory();
                break;
            case 3:
                System.out.println("Инициализация Пустынной фабрики...");
                factory = new DesertWorldFactory();
                break;
            default:
                System.out.println("Неверный ввод. По умолчанию загружен Лесной мир.");
                factory = new ForestWorldFactory();
                break;
        }

        System.out.println("======================================");

        // Клиент (GameLevel) получает фабрику и работает только с интерфейсами.
        // Он понятия не имеет, что именно выбрал пользователь.
        GameLevel level = new GameLevel(factory);
        level.startLevel();

        scanner.close();
    }
}