package com.hello.boardchat.dto;

import lombok.Data;

@Data
public class CommentUpdateDto {

    private String commentBody;

    public CommentUpdateDto() {}

    public CommentUpdateDto(String commentBody) {
        this.commentBody = commentBody;
    }
}
