package com.example.demo.modelproject;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="resrvationdetails")
public class ModelSeat {
	@Id
	private int bookingid;
	private String custname;
	private long custmobile;
	private String custmail;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk")
	private List<SeatModel> bookingdetails;
	public List<SeatModel> getbookingdetails(){
		return bookingdetails;
	}
	public void setbookingdetails (List<SeatModel>bookingdetails) {
		this.bookingdetails=bookingdetails;
	}
	public ModelSeat(int bookingid, String custname, long custmobile, String custmail) {
		super();
		this.bookingid = bookingid;
		this.custname = custname;
		this.custmobile = custmobile;
		this.custmail = custmail;
	}
	public ModelSeat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public long getCustmobile() {
		return custmobile;
	}
	public void setCustmobile(long custmobile) {
		this.custmobile = custmobile;
	}
	public String getCustmail() {
		return custmail;
	}
	public void setCustmail(String custmail) {
		this.custmail = custmail;
	}
	

}
