package com.example.MyProject.crudexample05;

import jakarta.persistence.*;

@Entity
@Table(name = "AppliedFilter",schema="ImageEditor")
public class Entity05 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filterID")
    private Long id;

    @Column(name = "appliedFilterID")
    private String appliedFilterID;

    @Column(name = "secondaryFilterID")
    private String secondaryFilterID;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getAppliedFilterID() {
        return appliedFilterID;
    }

    public void setAppliedFilterID(String appliedFilterID) {
        this.appliedFilterID = appliedFilterID;
    }

   

    public String getSecondaryFilterID() {
        return secondaryFilterID;
    }

    public void setSecondaryFilterID(String secondaryFilterID) {
        this.secondaryFilterID = secondaryFilterID;
    }
}
