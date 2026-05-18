package com.example.MyProject.crudexample04;

import jakarta.persistence.*;

@Entity
@Table(name = "Filter",schema="ImageEditor")
public class Entity04 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filterID")
    private Long id;

    @Column(name = "filtername")
    private String filtername;

    @Column(name = "description")
    private String description;

    @Column(name = "appliedFilters")
    private String appliedFilters;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getFiltername() {
        return filtername;
    }

    public void setFiltername(String filtername) {
        this.filtername = filtername;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppliedFilters() {
        return appliedFilters;
    }

    public void setAppliedFilters(String appliedFilters) {
        this.appliedFilters = appliedFilters;
    }
}
