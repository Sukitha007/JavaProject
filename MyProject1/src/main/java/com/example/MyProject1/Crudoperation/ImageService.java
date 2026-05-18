package com.example.MyProject1.Crudoperation;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    String uploadImage(MultipartFile file);
}