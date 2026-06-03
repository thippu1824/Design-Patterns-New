package com.example.Design.Pattern.creational.factory.SimpleNotificationSystem;

public class SMSNotification extends Notification {

    public SMSNotification(String sender, String recipient, String message) {
        super(sender, recipient, message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

    @Override
    public void send() {
        System.out.println("Sending notification to : " + recipient +
            " from : " + sender +
            " and the message is : " + message);
    }
}
