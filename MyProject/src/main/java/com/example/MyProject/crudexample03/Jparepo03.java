package com.example.MyProject.crudexample03;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jparepo03 extends JpaRepository<Entity03,Long >{

}
