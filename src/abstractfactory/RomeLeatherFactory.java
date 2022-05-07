package abstractfactory;

import factorymethod.RomeWatch;
import factorymethod.Watch;

public class RomeLeatherFactory implements Factory {
    @Override
    public Watch getWatch() {
        return new RomeWatch();
    }

    @Override
    public WatchCase getCase() {
        return new LeatherCase();
    }
}
