package com.hello.boardchat.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class File {

    private Long fileId;
    private Long postId;
    private String original_name;
    private String save_name;
    private Long file_size;
    private LocalDateTime uploadDate;

    public File() {}

    @Builder
    public File(Long postId, String original_name, String save_name,
                Long file_size) {
        this.postId = postId;
        this.original_name = original_name;
        this.save_name = save_name;
        this.file_size = file_size;
    }
}
