package com.ris.practise.designPatterns.observerPattern.apr_18_2024_a.Observable;

import com.ris.practise.designPatterns.observerPattern.apr_18_2024_a.Observer.ObserverBase;

public interface IObservable {
    public void add(ObserverBase o);

    public void remove(ObserverBase o);

    public void setData(int dataToSet);

    public void getData();

    public void notifyObservers();
}
