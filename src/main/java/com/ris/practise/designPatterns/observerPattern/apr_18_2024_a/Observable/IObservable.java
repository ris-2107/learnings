package com.ris.practise.designPatterns.observerPattern.apr_18_2024_a.Observable;

import com.ris.practise.designPatterns.observerPattern.apr_18_2024_a.Observer.IObserverBase;

public interface IObservable {
    public void add(IObserverBase o);

    public void remove(IObserverBase o);

    public void setData(int dataToSet);

    public int getData();

    public void notifyObservers();
}
