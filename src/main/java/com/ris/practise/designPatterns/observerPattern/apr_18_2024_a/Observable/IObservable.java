package com.ris.practise.designPatterns.observerPattern.apr_18_2024_a.Observable;

public interface IObservable {
    public void add();

    public void remove();

    public void setData();

    public void getData();

    public void notifyObservers();
}
