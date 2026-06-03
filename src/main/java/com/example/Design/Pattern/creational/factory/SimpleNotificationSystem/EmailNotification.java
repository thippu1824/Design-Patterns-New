package com.example.Design.Pattern.creational.factory.SimpleNotificationSystem;

public class EmailNotification extends Notification{

    public EmailNotification(String sender, String recipient, String message) {
        super(sender, recipient, message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void send() {
        System.out.println("Sending email to : " + recipient +
                            " from : " + sender + " and the message is : " +
                            message);
    }
}
