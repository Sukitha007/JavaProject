package com.example.MyProject1.Crudoperation;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "images")
@NoArgsConstructor
@AllArgsConstructor
public class ImageEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;
    private String publicId;
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getPublicId() {
		return publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	} 

}
