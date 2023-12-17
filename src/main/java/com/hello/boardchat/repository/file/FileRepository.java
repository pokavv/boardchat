package com.hello.boardchat.repository.file;

import com.hello.boardchat.domain.FileRequest;

import java.util.List;

public interface FileRepository {

    void saveFiles(Long postId, List<FileRequest> fileRequests);
}
