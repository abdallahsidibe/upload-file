package com.phoenix;

import com.phoenix.service.IFileStorageService;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileUploadApplication implements CommandLineRunner {

    @Resource
    IFileStorageService fileStorageService;
    public static void main(String[] args) {
        SpringApplication.run(FileUploadApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        fileStorageService.inti();
    }
}
