package com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observable;

import com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);
    public int getStockCount();


}
