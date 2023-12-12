package com.hello.boardchat.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Chat {

    private Long chatId;
    private String chatBody;
    private LocalDateTime chatDate;
    private Boolean isReported;

    public Chat() {}

    @Builder
    public Chat(Long chatId, String chatBody) {
        this.chatId = chatId;
        this.chatBody = chatBody;
    }
}
