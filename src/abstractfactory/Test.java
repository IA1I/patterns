package abstractfactory;

import factorymethod.Watch;

public class Test {
    public static void main(String[] args) {
        Factory factory = new DigitalMetalFactory();
        Watch watch = factory.getWatch();
        WatchCase watchCase = factory.getCase();

        watch.showTime();
        watchCase.protectWatch();
    }
}
