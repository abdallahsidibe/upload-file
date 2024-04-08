package com.phoenix.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface IFileStorageService {

    public void inti();
    public void saveFile(MultipartFile file);
    public Resource loadFile(String fileName);
    public void deleteAllFile();
    public Stream<Path>loadAllFile();

}
