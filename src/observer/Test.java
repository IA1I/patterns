package observer;

public class Test {
    public static void main(String[] args) {
        PublisherActionListener subscriber = new Subscriber();
        PublisherActionListener hater = new Hater();

        Publisher publisher = new Publisher();

        publisher.addListener(subscriber);
        publisher.addListener(hater);

        publisher.createNewMessage("Message!");
    }
}
