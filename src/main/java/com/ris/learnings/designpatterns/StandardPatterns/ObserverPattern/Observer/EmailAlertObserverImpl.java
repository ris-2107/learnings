package com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observer;

import com.ris.learnings.designpatterns.StandardPatterns.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(StocksObservable observable, String emailId ){
        this.observable=observable;
        this.emailId=emailId;
    }
    @Override
    public void update() {
        sendMail(emailId, "Product back in Stock" );

    }
    public void sendMail(String emailId, String msg){
        System.out.println("MAIL Sent to Email id :" +emailId + "'s User");
    }
}
