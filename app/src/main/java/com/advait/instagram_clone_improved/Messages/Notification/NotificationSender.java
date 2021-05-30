package com.advait.instagram_clone_improved.Messages.Notification;

public class NotificationSender {

    public Data data;
    public String to;

    public NotificationSender() {
    }

    public NotificationSender(Data data, String to) {
        this.data = data;
        this.to = to;
    }
}
