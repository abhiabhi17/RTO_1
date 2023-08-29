package com.rto.model;

import java.util.Date;



public class VehicleOwnerRegistrationModel {
	
	private Integer oid;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	private String fname;
	private String lname;
	private String email;
	private String dob;
	private String ssn;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "VehicleOwnerRegistrationModel [oid=" + oid + ", fname=" + fname + ", lname=" + lname + ", email="
				+ email + ", dob=" + dob + ", ssn=" + ssn + "]";
	}
	
}
