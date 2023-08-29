package com.rto.model;

import com.rto.entity.VehicleOwnerRegistrationEntity;

public class OwnerAddressModel {
	
	private Integer oaid;
	private Integer hno;
	private String streetno;
	private String city;
	private Integer zip;
	private VehicleOwnerRegistrationEntity vihcleOwnEntity;
	
	
	
	public Integer getOaid() {
		return oaid;
	}
	public void setOaid(Integer oaid) {
		this.oaid = oaid;
	}
	public VehicleOwnerRegistrationEntity getVihcleOwnEntity() {
		return vihcleOwnEntity;
	}
	public void setVihcleOwnEntity(VehicleOwnerRegistrationEntity vihcleOwnEntity) {
		this.vihcleOwnEntity = vihcleOwnEntity;
	}
	public Integer getHno() {
		return hno;
	}
	public void setHno(Integer hno) {
		this.hno = hno;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "OwnerAddressModel [oaid=" + oaid + ", hno=" + hno + ", streetno=" + streetno + ", city=" + city
				+ ", zip=" + zip + ", vihcleOwnEntity=" + vihcleOwnEntity + "]";
	}
	
	
}
