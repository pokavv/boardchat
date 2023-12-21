package com.hello.boardchat.repository.file;

import com.hello.boardchat.domain.FileRequest;
import com.hello.boardchat.domain.FileResponse;

import java.util.List;

public interface FileRepository {

    void saveFiles(Long postId, List<FileRequest> fileRequests);

    List<FileResponse> fileListByPostId(Long postId);

    List<FileResponse> fileListByFileId(List<Long> fileIdList);

    void deleteFileByFileId(Long fileId);
}
