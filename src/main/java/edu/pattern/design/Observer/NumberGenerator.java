package edu.pattern.design.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * NumberGenerator : Subject 로서, 자신의 상태 변화가 발생할 때, Observer에게 통지한다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/14
 **/
public abstract class NumberGenerator {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (final var observer :
                observers) {
            observer.update(this);
        }
    }

    public abstract Integer getNumber();

    public abstract void execute();
}