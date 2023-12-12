package com.hello.boardchat.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {

    private Long commentId;
    private Long postId; // fk
    private String commentBody;
    private LocalDateTime commentDate;
    private Boolean isSecret;

    public Comment() {}

    @Builder
    public Comment(Long postId, String commentBody, Boolean isSecret) {
        this.postId = postId;
        this.commentBody = commentBody;
        this.isSecret = isSecret;
    }
}
