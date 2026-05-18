package com.example.MyProject.crudexample04;

public interface Service04 {

	String createFilter(Dto04 dto04);

	Dto04 getFilter(Long id);

	String deleteFilter(Long id);

	String updateFilter(Long id, Dto04 dto04);

}
