package com.example.MyProject.crudexample01;

import java.util.List;

public interface Service01 {

	String createUser(Dto01 dto01);

	String updateUser(Long id, Dto01 dto01);

	String deleteUser(Long id);

	Dto01 getUser(Long id);

	List<Entity01> pageData1(int page, String username, String email);

	int deleteQuery(Long id);

	int updateQuery(Long id, String username);

	int updateQuery1(Long id, String email);




}
