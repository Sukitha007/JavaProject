package com.example.MyProject.crudexample02;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
@Table(name = "Image",schema="ImageEditor")

public class Entity02 {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="imageID")
	    private Long id;
	    @Column(name="filename")
	    private String filename;
	    @Column(name="filepath")
	    private String filepath;
	    @Column(name="uploadDate")
	    private Date uploadDate;
	    @Column(name="userID")
	    private String userID;
	    @Column(name="editHistory")
	    private String editHistory;
	   
	    public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		
		public String getFilename() {
			return filename;
		}
		public void setFilename(String filename) {
			this.filename = filename;
		}
		public String getFilepath() {
			return filepath;
		}
		public void setFilepath(String filepath) {
			this.filepath = filepath;
		}
		public Date getUploadDate() {
			return uploadDate;
		}
		public void setUploadDate(Date uploadDate) {
			this.uploadDate = uploadDate;
		}
		public String getUserID() {
			return userID;
		}
		public void setUserID(String userID) {
			this.userID = userID;
		}
		public String getEditHistory() {
			return editHistory;
		}
		public void setEditHistory(String editHistory) {
			this.editHistory = editHistory;
		}
	    

}