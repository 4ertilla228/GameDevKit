package B_abstractfactory.ice;
import B_abstractfactory.*;

public class IceEnemy implements Enemy {
    @Override public void attack() { System.out.println("Ледяной голем замораживает вас!"); }
}