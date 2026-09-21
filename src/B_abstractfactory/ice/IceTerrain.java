package B_abstractfactory.ice;
import B_abstractfactory.*;

public class IceTerrain implements Terrain {
    @Override public void render() { System.out.println("Отрисовка: Заснеженная пустошь и льды."); }
}
