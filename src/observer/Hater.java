package observer;

public class Hater implements PublisherActionListener{
    @Override
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getSimpleName());
    }
}
