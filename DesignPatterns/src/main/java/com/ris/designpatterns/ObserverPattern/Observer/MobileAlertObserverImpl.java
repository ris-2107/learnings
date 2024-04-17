package com.ris.designpatterns.ObserverPattern.Observer;

import com.ris.designpatterns.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable){
        this.userName=emailId;
        this.observable=observable;

    }
    @Override
    public void update() {
        sendNotifOnMobile(userName,"HOLLA");
    }

    void sendNotifOnMobile(String userName, String msg){
        System.out.println("MOBILE notification Sent To: "+userName);
    }
}
