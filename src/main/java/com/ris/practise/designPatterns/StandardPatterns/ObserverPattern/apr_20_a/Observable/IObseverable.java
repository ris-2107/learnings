package com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_20_a.Observable;

import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_20_a.Observer.IObserver;

public interface IObseverable {
    void add(IObserver ob);

    void remove(IObserver ob);

    void notifyObservers(IObserver ob);

    int getData(IObserver ob);

    int setData(IObserver ob);
}
