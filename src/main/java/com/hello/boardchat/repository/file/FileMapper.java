package com.hello.boardchat.repository.file;

import com.hello.boardchat.domain.FileRequest;
import com.hello.boardchat.domain.FileResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {

    void saveFiles(List<FileRequest> fileRequests);

    List<FileResponse> fileListByPostId(Long postId);

    List<FileResponse> fileListByFileId(List<Long> fileIdList);

    void deleteFileByFileId(Long fileId);
}
