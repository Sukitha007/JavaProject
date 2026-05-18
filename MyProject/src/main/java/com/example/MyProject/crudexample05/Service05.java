package com.example.MyProject.crudexample05;

public interface Service05 {

	String createAppliedFilter(Dto05 dto05);

	Dto05 getAppliedFilter(Long id);

	String updateAppliedFilter(Long id, Dto05 dto05);

	String deleteAppliedFilter(Long id);

	

}
