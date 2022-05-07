package abstractfactory;

import factorymethod.DigitalWatch;
import factorymethod.Watch;

public class DigitalMetalFactory implements Factory {
    @Override
    public Watch getWatch() {
        return new DigitalWatch();
    }

    @Override
    public WatchCase getCase() {
        return new MetalCase();
    }
}
