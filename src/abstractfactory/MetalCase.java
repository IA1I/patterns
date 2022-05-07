package abstractfactory;

public class MetalCase implements WatchCase {
    @Override
    public void protectWatch() {
        System.out.println("Часы в металлическом чехле");
    }
}
