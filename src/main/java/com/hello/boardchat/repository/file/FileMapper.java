package com.hello.boardchat.repository.file;

import com.hello.boardchat.domain.FileRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {

    void saveFiles(List<FileRequest> fileRequests);
}
