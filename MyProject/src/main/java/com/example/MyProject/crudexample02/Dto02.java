package com.example.MyProject.crudexample02;
import java.util.Date;

import lombok.Data;

public class Dto02 {
	  private long id;
	  private String filename;
	  private String filepath;
	  private Date uploadDate;
	  private String userID;
	  private String editHistory;
	
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	}

