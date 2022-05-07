package facade;

public class Engine implements Car {
    @Override
    public void start() {
        System.out.println("Завести двигатель");
    }

    @Override
    public void stop() {
        System.out.println("Заглушить двигатель");
    }
}
