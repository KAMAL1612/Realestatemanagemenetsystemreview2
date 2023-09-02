package com.example.demo.modelproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="additionaldetails")
public class SeatModel {
	@Id
	private int custaltmobileno;
	private String housetype;
	private String state;
	private String district;
	private String location;
	public SeatModel(int custaltmobileno, String housetype, String state, String district, String location) {
		super();
		this.custaltmobileno = custaltmobileno;
		this.housetype = housetype;
		this.state = state;
		this.district = district;
		this.location = location;
	}
	public SeatModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustaltmobileno() {
		return custaltmobileno;
	}
	public void setCustaltmobileno(int custaltmobileno) {
		this.custaltmobileno = custaltmobileno;
	}
	public String getHousetype() {
		return housetype;
	}
	public void setHousetype(String housetype) {
		this.housetype = housetype;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
