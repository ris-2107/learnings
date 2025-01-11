package com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observable;

import com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StocksObservable {
    public List<NotificationAlertObserver> observerList= new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver ob:observerList ){
            ob.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        // if stock is added, then notification goes.
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount=stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
