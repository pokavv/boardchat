package com.hello.boardchat.repository.file;

import com.hello.boardchat.domain.FileRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class FileUtils {

    private final String uploadPath = Paths.get("C:", "develop", "upload-files").toString();

    public List<FileRequest> uploadFiles(final List<MultipartFile> multipartFiles) {
        List<FileRequest> fileRequests = new ArrayList<>();
        for (MultipartFile multipartFile : multipartFiles) {
            if (multipartFile.isEmpty()) {
                continue;
            }
            fileRequests.add(uploadFile(multipartFile));
        }
        return fileRequests;
    }

    public FileRequest uploadFile(final MultipartFile multipartFile) {
        if (multipartFile.isEmpty()) {
            return null;
        }
        String saveFileName = generateSaveFileName(multipartFile.getOriginalFilename());
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMdd")).toString();
        String uploadPath = getUploadPath(today) + File.separator + saveFileName;
        File uploadFile = new File(uploadPath);

        try {
            multipartFile.transferTo(uploadFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return FileRequest.builder()
                .originalName(multipartFile.getOriginalFilename())
                .saveName(saveFileName)
                .fileSize(multipartFile.getSize())
                .build();
    }

    private String generateSaveFileName(final String fileName) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        String extension = StringUtils.getFilenameExtension(fileName);
        return uuid + "." + extension;
    }

    private String getUploadPath() {
        return makeDirectories(uploadPath);
    }

    private String getUploadPath(final String addPath) {
        return makeDirectories(uploadPath + File.separator + addPath);
    }

    private String makeDirectories(final String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir.getPath();
    }
}
