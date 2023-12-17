package com.hello.boardchat.config.file;

import com.hello.boardchat.repository.file.FileMapper;
import com.hello.boardchat.repository.file.FileRepository;
import com.hello.boardchat.repository.file.FileRepositoryImpl;
import com.hello.boardchat.repository.file.FileUtils;
import com.hello.boardchat.service.file.FileService;
import com.hello.boardchat.service.file.FileServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FileConfig {

    private final FileMapper fileMapper;

    @Bean
    public FileUtils fileUtils() {
        return new FileUtils();
    }

    @Bean
    public FileService fileService() {
        return new FileServiceImpl(fileRepository());
    }

    @Bean
    public FileRepository fileRepository() {
        return new FileRepositoryImpl(fileMapper);
    }
}
