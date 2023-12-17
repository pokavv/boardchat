package com.hello.boardchat.service.file;

import com.hello.boardchat.domain.FileRequest;

import java.util.List;

public interface FileService {

    void saveFiles(Long postId,List<FileRequest> fileRequests);
}
