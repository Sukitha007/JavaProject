package com.example.MyProject.Examplecrud;

import org.springframework.data.jpa.repository.JpaRepository;

	public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
	}

