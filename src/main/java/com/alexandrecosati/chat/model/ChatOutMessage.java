package com.alexandrecosati.chat.model;

import java.util.Date;

public class ChatOutMessage {
    private String content;
    private String groupName;
    private Date timeStamp;

    public ChatOutMessage(String message) {
        this.content = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
