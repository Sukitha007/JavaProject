package com.example.MyProject.Examplecrud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "images")

	
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
