package com.example.Design.Pattern.creational.factory.SimpleNotificationSystem;

public class NotificationFactory {

    public static Notification createNotification(String sender, String recipient, String message,
        NotificationType notificationType) {

        switch (notificationType) {

            case EMAIL:
                return new EmailNotification(sender, recipient, message);

            case SMS:
                return new SMSNotification(sender, recipient, message);

            case PUSH:
                return new PUSHNotification(sender, recipient, message);

            default:
                throw new IllegalArgumentException("Unsupported notification type");
        }

    }
}
