package facade;

public class Facade {
    private Key key;
    private Engine engine;

    public Facade(){
        this.key = new Key();
        this.engine = new Engine();
    }

    public void startCar(){
        key.start();
        engine.start();
    }

    public void stopCar(){
        key.stop();
        engine.stop();
    }
}
