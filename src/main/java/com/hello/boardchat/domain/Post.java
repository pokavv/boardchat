package com.hello.boardchat.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Post {

    private Long postId;
    private String title;
    private String postBody;
    private LocalDateTime postDate;
    private Boolean isNotice;
    private List<MultipartFile> files = new ArrayList<>(); // 첨부파일

    public Post() {}

    @Builder
    public Post(String title, String postBody, Boolean isNotice) {
        this.title = title;
        this.postBody = postBody;
        this.isNotice = isNotice;
    }
}
