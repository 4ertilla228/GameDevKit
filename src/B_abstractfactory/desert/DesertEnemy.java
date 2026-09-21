package B_abstractfactory.desert;
import B_abstractfactory.*;

public class DesertEnemy implements Enemy {
    @Override public void attack() { System.out.println("Песок засыпает вам глаза!"); }
}