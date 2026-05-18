package com.example.MyProject.crudexample06;

public interface Service06 {

	String createEdit(Dto06 dto06);

	Dto06 getEdit(Long id);

	String updateEdit(Long id, Dto06 dto06);

	String deleteEdit(Long id);

}
