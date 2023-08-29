package com.rto.model;

import java.util.Date;


import com.rto.entity.VehicleOwnerRegistrationEntity;




public class VehicleDetailsModel {
	
	private Integer vid;
	private String type;
	private Integer year;
	private String vcompanyname;
	private VehicleOwnerRegistrationEntity vehicleOwn;
	public String getType() {
		return type;
	}
	
	public Integer getVid() {
		return vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
	}

	public void setType(String type) {
		this.type = type;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getVcompanyname() {
		return vcompanyname;
	}
	public void setVcompanyname(String vcompanyname) {
		this.vcompanyname = vcompanyname;
	}
	public VehicleOwnerRegistrationEntity getVehicleOwn() {
		return vehicleOwn;
	}
	public void setVehicleOwn(VehicleOwnerRegistrationEntity vehicleOwn) {
		this.vehicleOwn = vehicleOwn;
	}

	@Override
	public String toString() {
		return "VehicleDetailsModel [vid=" + vid + ", type=" + type + ", year=" + year + ", vcompanyname="
				+ vcompanyname + ", vehicleOwn=" + vehicleOwn + "]";
	}
	

}
