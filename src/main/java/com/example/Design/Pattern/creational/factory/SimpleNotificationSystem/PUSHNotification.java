package com.example.Design.Pattern.creational.factory.SimpleNotificationSystem;

public class PUSHNotification extends Notification {

    public PUSHNotification(String sender, String recipient, String message) {
        super(sender, recipient, message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public void send() {
        System.out.println("Sending notification to : " + recipient +
            " from :" + sender +
            " and the message is" + message);
    }
}
