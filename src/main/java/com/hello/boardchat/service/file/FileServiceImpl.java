package com.hello.boardchat.service.file;

import com.hello.boardchat.domain.FileRequest;
import com.hello.boardchat.domain.FileResponse;
import com.hello.boardchat.repository.file.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;

    @Override
    public void saveFiles(Long postId, List<FileRequest> fileRequests) {
        fileRepository.saveFiles(postId, fileRequests);
    }

    @Override
    public List<FileResponse> fileListByPostId(Long postId) {
        return fileRepository.fileListByPostId(postId);
    }

    @Override
    public List<FileResponse> fileListByFileId(List<Long> fileIdList) {
        return fileRepository.fileListByFileId(fileIdList);
    }

    @Override
    public void deleteFileByFileId(Long fileId) {
        fileRepository.deleteFileByFileId(fileId);
    }
}
