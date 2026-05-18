package com.example.MyProject.crudexample02;


public interface Service02 {

	String updateImage(Long id, Dto02 dto02);

	String deleteImage(Long id);

	String createImage(Dto02 dto02);

	Dto02 getImage(Long id);

	

	

}
