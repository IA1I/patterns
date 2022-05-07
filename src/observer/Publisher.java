package observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements PublisherInterface {
    private List<PublisherActionListener> listeners = new ArrayList<>();
    @Override
    public List<PublisherActionListener> getListeners() {
        return this.listeners;
    }

    @Override
    public void addListener(PublisherActionListener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removeListener(PublisherActionListener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void notifySubscribers(String message) {
        for(PublisherActionListener actionListener : listeners)
            actionListener.doAction(message);
    }

    public void createNewMessage(String message) {
        System.out.println("Publisher printed message " + message);
        notifySubscribers(message);
    }
}
