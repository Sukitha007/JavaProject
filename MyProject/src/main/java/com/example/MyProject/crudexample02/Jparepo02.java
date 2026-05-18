package com.example.MyProject.crudexample02;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jparepo02 extends JpaRepository<Entity02,Long>{

}
