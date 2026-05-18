package com.example.MyProject.utilpackage;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfiguration {

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "du0bihdbx",
                "api_key", "978228257119647",
                "api_secret", "M7tqPWZCCJjrisH9EwwiVRW9fNw"));
    }
}
