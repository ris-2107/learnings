package com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observer;

import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observable.IObservable;

public class SpaceXObserver implements IObserverBase {

    IObservable observable;
    String personName;

    public SpaceXObserver(IObservable ob, String personName) {
        this.observable = ob;
        this.personName = personName;
    }

    @Override
    public void update() {
        System.out.println("SPACEX RECEIVED NOTIFICATION " + "POST " + personName);
    }
}
