package abstractfactory;

import factorymethod.Watch;

public interface Factory {
    Watch getWatch();
    WatchCase getCase();
}
