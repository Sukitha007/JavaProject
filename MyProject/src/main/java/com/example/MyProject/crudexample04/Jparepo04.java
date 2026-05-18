package com.example.MyProject.crudexample04;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jparepo04 extends JpaRepository<Entity04,Long >{

}
