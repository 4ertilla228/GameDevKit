package B_abstractfactory.forest;

import B_abstractfactory.Soundtrack;

public class ForestSoundTrack implements Soundtrack {
    @Override public void play() {
        System.out.println("Играет: Напряжённая флейта");}
}
