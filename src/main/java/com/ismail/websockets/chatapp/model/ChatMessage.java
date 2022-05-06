package com.ismail.websockets.chatapp.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ChatMessage
{
    private MessageType type;

    private String content;

    private String sender;

    // JS will create a timestamp as string; so we are just keeping it as is
    private String time;
}
