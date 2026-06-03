package com.example.Design.Pattern.creational.factory.SimpleNotificationSystem;

public abstract class Notification {

    protected String sender;
    protected String recipient;
    protected String message;

    public Notification(String sender, String recipient, String message) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void logNotification() {
        System.out.println("Notification created for : " + recipient);
    }

    public abstract NotificationType notificationType();

    public abstract void send();
}
