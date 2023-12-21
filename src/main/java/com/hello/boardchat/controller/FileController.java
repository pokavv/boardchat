package com.hello.boardchat.controller;

import com.hello.boardchat.domain.FileResponse;
import com.hello.boardchat.service.file.FileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @GetMapping("/posts/{postId}/files")
    public List<FileResponse> fileListByPostId(@PathVariable Long postId) {
        return fileService.fileListByPostId(postId);
    }
}
