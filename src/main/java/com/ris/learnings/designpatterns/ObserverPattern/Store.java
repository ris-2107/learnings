package com.ris.learnings.designpatterns.ObserverPattern;

import com.ris.learnings.designpatterns.ObserverPattern.Observable.IPhoneObservableImpl;
import com.ris.learnings.designpatterns.ObserverPattern.Observable.StocksObservable;
import com.ris.learnings.designpatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.ris.learnings.designpatterns.ObserverPattern.Observer.MobileAlertObserverImpl;
import com.ris.learnings.designpatterns.ObserverPattern.Observer.NotificationAlertObserver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Store {
    public static void main(String args[]) {
        StocksObservable iphoneStoCkObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iphoneStoCkObservable, "1@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iphoneStoCkObservable, "2@gmail.com");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("3@gmail.com", iphoneStoCkObservable);

        iphoneStoCkObservable.add(observer1);
        iphoneStoCkObservable.add(observer2);
        iphoneStoCkObservable.add(observer3);

        iphoneStoCkObservable.setStockCount(10);


    }
}
