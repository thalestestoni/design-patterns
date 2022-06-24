package observer;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {
    private List<Observer> _observers;

    public Subject() {
        _observers = new LinkedList<Observer>();
    }

    public void Attach(Observer observer){
        _observers.add(observer);
    }

    public void Remove(Observer observer) {
        _observers.remove(observer);
    }

    public void Notify() {
        for (Observer observer : _observers) {
            observer.update(this);
        }
    }
}
