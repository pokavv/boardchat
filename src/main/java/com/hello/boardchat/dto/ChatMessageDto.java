package com.hello.boardchat.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ChatMessageDto {

    public enum MessageType {
        ENTER, TALK
    }

    private MessageType messageType;
    private Long chatRoomId;
    private Long senderId;
    private String message;
}
