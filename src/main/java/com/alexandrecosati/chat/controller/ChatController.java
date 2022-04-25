package com.alexandrecosati.chat.controller;

import com.alexandrecosati.chat.model.ChatInMessage;
import com.alexandrecosati.chat.model.ChatOutMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/guestchat")
    @SendTo("/topic/guestchats")
    public ChatOutMessage handleMessaging(ChatInMessage message) throws Exception {
        Thread.sleep(1000);
        return new ChatOutMessage(message.getMessage());
    }

    @MessageMapping("/guestupdate")
    @SendTo("/topic/guestupdates")
    public ChatOutMessage handleUserIsTyping(ChatInMessage message) throws Exception {
        return new ChatOutMessage("Someone is Typing...");
    }
}
