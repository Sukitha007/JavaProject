package com.example.MyProject.crudexample03;

import jakarta.persistence.*;

@Entity
@Table(name = "Template",schema="ImageEditor")
public class Entity03 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "templateID")
    private Long id;

    @Column(name = "templatename")
    private String templatename;

    @Column(name = "filepath")
    private String filepath;

    @Column(name = "uploadedBy")
    private String uploadedBy;

    @Column(name = "filter")
    private String filter;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTemplatename() {
		return templatename;
	}
	public void setTemplatename(String templatename) {
		this.templatename = templatename;
	}
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	public String getUploadedBy() {
		return uploadedBy;
	}
	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	

}