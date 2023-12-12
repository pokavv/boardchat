package com.hello.boardchat.repository.post;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostSearchCond {

    private String title;
    private String postBody;
    private LocalDateTime postDate;
    private Boolean isNotice;

    public PostSearchCond() {}

    public PostSearchCond(String title, String postBody, LocalDateTime postDate, Boolean isNotice) {
        this.title = title;
        this.postBody = postBody;
        this.postDate = postDate;
        this.isNotice = isNotice;
    }
}
