package com.cts.pojo;

public class Upload {
	private int id;
	private String uploadType,uploadNumber;
	private String uploadOn,uploadLocation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUploadType() {
		return uploadType;
	}
	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}
	public String getUploadNumber() {
		return uploadNumber;
	}
	public void setUploadNumber(String uploadNumber) {
		this.uploadNumber = uploadNumber;
	}
	public String getUploadOn() {
		return uploadOn;
	}
	public void setUploadOn(String uploadOn) {
		this.uploadOn = uploadOn;
	}
	public String getUploadLocation() {
		return uploadLocation;
	}
	public void setUploadLocation(String uploadLocation) {
		this.uploadLocation = uploadLocation;
	}
}
