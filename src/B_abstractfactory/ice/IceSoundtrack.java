package B_abstractfactory.ice;
import B_abstractfactory.*;

public class IceSoundtrack implements Soundtrack {
    @Override public void play() { System.out.println("Играет: Холодный гул ветра и звон сосулек."); }
}