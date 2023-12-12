package com.hello.boardchat.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {

    private Long postId;
    private String title;
    private String postBody;
    private LocalDateTime postDate;
    private Boolean isNotice;

    public Post() {}

    @Builder
    public Post(String title, String postBody, Boolean isNotice) {
        this.title = title;
        this.postBody = postBody;
        this.isNotice = isNotice;
    }
}
