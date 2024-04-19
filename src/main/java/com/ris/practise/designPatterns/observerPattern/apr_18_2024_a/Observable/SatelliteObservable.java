package com.ris.practise.designPatterns.observerPattern.apr_18_2024_a.Observable;

import com.ris.practise.designPatterns.observerPattern.apr_18_2024_a.Observer.ObserverBase;

import java.util.ArrayList;
import java.util.List;

public class SatelliteObservable implements IObservable {
    List<ObserverBase> observers = new ArrayList<>();
    int initNoOfSat = 0;

    @Override
    public void add(ObserverBase ob) {
        observers.add(ob);
    }

    @Override
    public void remove(ObserverBase ob) {
        observers.remove(ob);
    }

    @Override
    public void setData(int dataToSet) {
        if (initNoOfSat == 0) {
            notifyObservers();
        }
        initNoOfSat += dataToSet;
    }

    @Override
    public void getData() {

    }

    @Override
    public void notifyObservers() {
        for (ObserverBase ob : observers) {
            ob.update();
        }
    }
}
