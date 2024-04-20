package com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observer;

import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observable.IObservable;

public class NasaObserver implements IObserverBase {

    IObservable observable;
    String personName;

    public NasaObserver(IObservable ob, String peronName) {
        this.observable = ob;
        this.personName = peronName;
    }

    @Override
    public void update() {
        System.out.println("NASA RECEIVED NOTIFICATION " + "POST : " + personName);
    }

}
