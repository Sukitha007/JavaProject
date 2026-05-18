package com.example.MyProject.crudexample01;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface Jparepo01 extends JpaRepository<Entity01,Long>{
	
	List<Entity01> findAllByUsername(PageRequest p1, String username);

	
	@Modifying
	@Transactional
	@Query("update Entity01 t set t.username=:username where t.id=:id")
	public int updateQuery(@Param("id") Long id, @Param("username")String username);

	@Modifying
	@Transactional
	@Query("DELETE FROM Entity01 t where t.id=id")
	public int deleteQuery(@Param("id")Long id);

	@Modifying
	@Transactional
	@Query("update Entity01 t set t.email=:email where t.id=:id ")
	public int updateQuery1(@Param("id")Long id,@Param("email")String email);

}
