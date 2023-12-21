package com.hello.boardchat.repository.file;

import com.hello.boardchat.domain.FileRequest;
import com.hello.boardchat.domain.FileResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class FileRepositoryImpl implements FileRepository {

    private final FileMapper fileMapper;

    @Override
    public void saveFiles(Long postId, List<FileRequest> fileRequests) {
        if (CollectionUtils.isEmpty(fileRequests)) {
            return;
        }
        for (FileRequest fileRequest : fileRequests) {
            fileRequest.setUploadDate(LocalDateTime.now());
            fileRequest.setPostId(postId);
        }
        fileMapper.saveFiles(fileRequests);
    }

    @Override
    public List<FileResponse> fileListByPostId(Long postId) {
        return fileMapper.fileListByPostId(postId);
    }

    @Override
    public List<FileResponse> fileListByFileId(List<Long> fileIdList) {
        if (CollectionUtils.isEmpty(fileIdList)) {
            return Collections.emptyList();
        }
        return fileMapper.fileListByFileId(fileIdList);
    }

    @Override
    public void deleteFileByFileId(Long fileId) {
        fileMapper.deleteFileByFileId(fileId);
    }
}
