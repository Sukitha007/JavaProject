package com.example.MyProject.crudexample03;

public interface Service03 {

	String createTemplate(Dto03 dto03);

	Dto03 getTemplate(Long id);

	String updateTemplate(Long id, Dto03 dto03);

	String deleteTemplate(Long id);

}
