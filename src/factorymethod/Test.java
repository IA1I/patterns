package factorymethod;

public class Test {
    public static void main(String[] args) {
        WatchMaker watchMaker = getMaker(WatchType.ROME);

        Watch watch= watchMaker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMaker(WatchType type){
        WatchMaker maker = null;
        switch (type){
            case ROME: maker = new RomeWatchMaker();
            break;
            case DIGITAL: maker = new DigitalWatchMaker();
            break;
        }
        return maker;
    }


}
