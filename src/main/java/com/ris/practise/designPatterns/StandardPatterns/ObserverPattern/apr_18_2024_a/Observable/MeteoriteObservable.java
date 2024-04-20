package com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observable;

import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observer.IObserverBase;

import java.util.ArrayList;
import java.util.List;

public class MeteoriteObservable implements IObservable {
    List<IObserverBase> observersList = new ArrayList<>();
    int initialMeteoriteData = 30000;


    @Override
    public void add(IObserverBase o) {
        observersList.add(o);
    }

    @Override
    public void remove(IObserverBase o) {
        observersList.remove(o);
    }

    @Override
    public void setData(int dataToSet) {
        if (dataToSet < initialMeteoriteData) {
            notifyObservers();
        }
        initialMeteoriteData += dataToSet;
    }

    @Override
    public int getData() {
        System.out.println("RET VALUE: " + initialMeteoriteData);
        return initialMeteoriteData;
    }

    @Override
    public void notifyObservers() {
        for (IObserverBase ob : observersList) {
            ob.update();
        }
    }
}
