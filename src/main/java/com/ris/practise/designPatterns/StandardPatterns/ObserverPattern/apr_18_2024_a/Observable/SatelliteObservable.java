package com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observable;

import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observer.IObserverBase;

import java.util.ArrayList;
import java.util.List;

public class SatelliteObservable implements IObservable {
    List<IObserverBase> observers = new ArrayList<>();
    int noOfSatellites = 0;

    @Override
    public void add(IObserverBase ob) {
        observers.add(ob);
    }

    @Override
    public void remove(IObserverBase ob) {
        observers.remove(ob);
    }

    @Override
    public int getData() {
        System.out.println("RET VALUE: " + noOfSatellites);
        return noOfSatellites;
    }

    @Override
    public void setData(int dataToSet) {
        if (noOfSatellites == 0) notifyObservers();
        noOfSatellites += dataToSet;
    }

    @Override
    public void notifyObservers() {
        for (IObserverBase ob : observers) {
            ob.update();
        }
    }
}
