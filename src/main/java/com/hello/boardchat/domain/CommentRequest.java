package com.hello.boardchat.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentRequest {

    private Long commentId;
    private Long postId; // fk
    private String commentBody;
    private LocalDateTime commentDate;
    private Boolean isSecret;

    public CommentRequest() {}

    public CommentRequest(Long postId, String commentBody, Boolean isSecret) {
        this.postId = postId;
        this.commentBody = commentBody;
        this.isSecret = isSecret;
    }
}
