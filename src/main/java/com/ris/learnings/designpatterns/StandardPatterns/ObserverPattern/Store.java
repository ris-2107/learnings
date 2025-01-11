package com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern;

import com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observable.IPhoneObservableImpl;
import com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observable.StocksObservable;
import com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observer.MobileAlertObserverImpl;
import com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observer.NotificationAlertObserver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Store {
    public static void main(String args[]) {
        StocksObservable iphoneStockObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl(iphoneStockObservable, "ob1@gmail.com");
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl(iphoneStockObservable, "ob2@gmail.com");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("ob3@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);


    }
}
