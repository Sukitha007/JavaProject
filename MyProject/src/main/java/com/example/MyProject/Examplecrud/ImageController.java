package com.example.MyProject.Examplecrud;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;

@RestController
@RequestMapping("/api/images")

public class ImageController {
	

	    private final ImageService imageService;

	    public ImageController(ImageService imageService) {
	        this.imageService = imageService;
	    }

	    
	    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file) {
	        String url = imageService.uploadImage(file);
	        return ResponseEntity.ok(Collections.singletonMap("imageUrl", url));
	    }

}
