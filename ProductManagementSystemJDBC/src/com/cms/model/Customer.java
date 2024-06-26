package com.cms.model;

public class Customer {
	private int cid;
	private String fname;
	private String lname;
	private String email;
	private long mbphone;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMbphone() {
		return mbphone;
	}
	public void setMbphone(long mbphone) {
		this.mbphone = mbphone;
	}
	public Customer(int cid, String fname, String lname, String email, long mbphone) {
		super();
		this.cid = cid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mbphone = mbphone;
	}

}
