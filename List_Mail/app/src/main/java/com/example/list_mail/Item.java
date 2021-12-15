package com.example.list_mail;

public class Item {
    String sender, content, time;

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }

    public Item(String sender, String content, String time) {
        this.sender = sender;
        this.content = content;
        this.time = time;
}
}