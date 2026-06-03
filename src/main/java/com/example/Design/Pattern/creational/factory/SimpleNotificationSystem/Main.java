package com.example.Design.Pattern.creational.factory.SimpleNotificationSystem;

public class Main {

    public static void main(String[] args) {

        Notification emailNotification =
            NotificationFactory.createNotification("swamy", "charlyn", "Hi charlyn what are you doing",
                NotificationType.SMS);

        emailNotification.logNotification();
        emailNotification.send();

    }
}
