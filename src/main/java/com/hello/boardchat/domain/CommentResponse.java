package com.hello.boardchat.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentResponse {

    private Long commentId;
    private Long postId; // fk
    private String commentBody;
    private LocalDateTime commentDate;
    private Boolean isSecret;

    public CommentResponse() {}

    public CommentResponse(Long postId, String commentBody, Boolean isSecret) {
        this.postId = postId;
        this.commentBody = commentBody;
        this.isSecret = isSecret;
    }
}
