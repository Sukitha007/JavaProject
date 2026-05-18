package com.example.MyProject.crudexample06;

import jakarta.persistence.*;

@Entity
@Table(name = "Edit",schema="ImageEditor")
public class Entity06 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "editID")
    private Long id;

    @Column(name = "imageID")
    private String imageID;

    @Column(name = "action")
    private String action;


    @Column(name = "template")
    private String template;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

	

}
