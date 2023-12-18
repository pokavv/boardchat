package com.hello.boardchat.repository.comment;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentSearchCond {

    private Long postId;
    private String commentBody;
    private LocalDateTime commentDate;
    private Boolean isSecret;

    public CommentSearchCond() {}

    public CommentSearchCond(Long postId, String commentBody, LocalDateTime commentDate, Boolean isSecret) {
        this.postId = postId;
        this.commentBody = commentBody;
        this.commentDate = commentDate;
        this.isSecret = isSecret;
    }
}