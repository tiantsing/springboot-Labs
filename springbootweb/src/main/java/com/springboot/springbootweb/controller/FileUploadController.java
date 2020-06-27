package com.springboot.springbootweb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * FileUpload
 * @author tianq
 */
@RestController
public class FileUploadController {
    @PostMapping("fileUploadController")
    public String fileUpload(MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("d:/"+file.getOriginalFilename()));
        return "OK";
    }
}
