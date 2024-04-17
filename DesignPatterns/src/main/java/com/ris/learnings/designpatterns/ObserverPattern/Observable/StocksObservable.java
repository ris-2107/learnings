package com.ris.learnings.designpatterns.ObserverPattern.Observable;

import com.ris.learnings.designpatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);
    public int getStockCount();


}
