package com.hello.boardchat.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FileResponse {

    private Long fileId;
    private Long postId;
    private String originalName;
    private String saveName;
    private Long fileSize;
    private LocalDateTime uploadDate;
}
