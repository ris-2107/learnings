package com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a;

import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observable.IObservable;
import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observable.MeteoriteObservable;
import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observable.SatelliteObservable;
import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observer.NasaObserver;
import com.ris.practise.designPatterns.StandardPatterns.ObserverPattern.apr_18_2024_a.Observer.SpaceXObserver;

public class Runner {
    public static void main(String[] args) {
        IObservable meteorObservable = new MeteoriteObservable();
        IObservable satelliteObservable = new SatelliteObservable();

        NasaObserver scientist_GARY_MATHEWS = new NasaObserver(meteorObservable, "scientist_GARY_MATHEWS"); // Gary wants to observe Meteors.
        SpaceXObserver director_TOM_RICHARDS = new SpaceXObserver(satelliteObservable, "director_TOM_RICHARDS");
        SpaceXObserver staff_eng_AMAN_ROHILLA = new SpaceXObserver(meteorObservable, "staff_eng_AMAN_ROHILLA");

        meteorObservable.add(scientist_GARY_MATHEWS);
        meteorObservable.add(staff_eng_AMAN_ROHILLA);
        satelliteObservable.add(director_TOM_RICHARDS);

        meteorObservable.setData(50000);
        meteorObservable.setData(5000);
        satelliteObservable.setData(1);
        satelliteObservable.setData(10);


    }
}
