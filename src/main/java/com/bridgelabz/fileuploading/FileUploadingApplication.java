package com.bridgelabz.fileuploading;

import com.bridgelabz.fileuploading.model.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class FileUploadingApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadingApplication.class, args);
        System.out.println("Hello this project is to uploadFiles");
    }
}
