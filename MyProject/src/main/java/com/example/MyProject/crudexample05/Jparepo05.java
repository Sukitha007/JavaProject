package com.example.MyProject.crudexample05;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Jparepo05 extends JpaRepository<Entity05,Long>{

}
