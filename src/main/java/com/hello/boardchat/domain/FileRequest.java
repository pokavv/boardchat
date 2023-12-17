package com.hello.boardchat.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FileRequest {

    private Long fileId;
    private Long postId;
    private String originalName;
    private String saveName;
    private Long fileSize;
    private LocalDateTime uploadDate;

    public FileRequest() {}

    @Builder
    public FileRequest(Long postId, String originalName, String saveName,
                       Long fileSize) {
        this.postId = postId;
        this.originalName = originalName;
        this.saveName = saveName;
        this.fileSize = fileSize;
    }
}
