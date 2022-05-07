package abstractfactory;

public class LeatherCase implements WatchCase {
    @Override
    public void protectWatch() {
        System.out.println("Часы в кожаном чехле");
    }
}
