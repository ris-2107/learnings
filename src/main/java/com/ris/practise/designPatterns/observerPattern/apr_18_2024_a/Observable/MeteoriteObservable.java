package com.ris.practise.designPatterns.observerPattern.apr_18_2024_a.Observable;

import com.ris.practise.designPatterns.observerPattern.apr_18_2024_a.Observer.ObserverBase;

import java.util.ArrayList;
import java.util.List;

public class MeteoriteObservable implements IObservable {
    List<ObserverBase> observersList = new ArrayList<>();
    int initialMeteoriteData = 1000;


    @Override
    public void add(ObserverBase o) {
        observersList.add(o);
    }

    @Override
    public void remove(ObserverBase o) {
        observersList.remove(o);
    }

    @Override
    public void setData(int dataToSet) {
        if (dataToSet > initialMeteoriteData) {
            notifyObservers();
        }
        initialMeteoriteData += dataToSet;
    }

    @Override
    public void getData() {
        System.out.print(initialMeteoriteData);
    }

    @Override
    public void notifyObservers() {
        for (ObserverBase ob : observersList) {
            ob.update();
        }
    }
}
