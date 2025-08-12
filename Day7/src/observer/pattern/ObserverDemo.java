package observer.pattern;

import java.util.*;

interface Observer {
    void update(String event);
}

interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers(String event);
}

class EventManager implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public synchronized void register(Observer o) {
        observers.add(o);
    }

    @Override
    public synchronized void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String event) {
        // copy to avoid ConcurrentModification on self-unregister
        List<Observer> copy;
        synchronized(this) { copy = new ArrayList<>(observers); }
        for (Observer o : copy) {
            o.update(event);
        }
    }
}

// Observers:
class EmailNotifier implements Observer {
    private final String email;
    public EmailNotifier(String email) { this.email = email; }
    public void update(String event) {
        System.out.println("Email to " + email + ": " + event);
    }
}

class SmsNotifier implements Observer {
    private final String phone;
    public SmsNotifier(String phone) { this.phone = phone; }
    public void update(String event) {
        System.out.println("SMS to " + phone + ": " + event);
    }
}

// Demo:
public class ObserverDemo {
    public static void main(String[] args) {
        EventManager subject = new EventManager();
        subject.register(new EmailNotifier("user@hdfc.com"));
        subject.register(new SmsNotifier("9876543210"));

        subject.notifyObservers("New builder.pattern.Policy created: POL001");
    }
}
