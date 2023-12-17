package com.hello.boardchat.service.file;

import com.hello.boardchat.domain.FileRequest;
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
}
