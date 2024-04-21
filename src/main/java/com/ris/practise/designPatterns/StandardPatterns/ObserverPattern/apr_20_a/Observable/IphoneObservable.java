package com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_20_a.Observable;

import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_20_a.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;


public class IphoneObservable implements IObseverable {
    private final List<IObserver> observersList = new ArrayList<>();


    @Override
    public void add(IObserver ob) {
        observersList.add(ob);
    }

    @Override
    public void remove(IObserver ob) {
        observersList.remove(ob);
    }

    @Override
    public void notifyObservers(IObserver ob) {
        for (IObserver observer : observersList) {
            observer.update();
        }
    }

    @Override
    public int getData(IObserver ob) {
        return 0;
    }

    @Override
    public int setData(IObserver ob) {
        return 0;
    }
}
