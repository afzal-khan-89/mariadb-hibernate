package com.vts.dbhibernate.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="demo_data")
public class DemoData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "demo_data")
	@SequenceGenerator(name="demo_data", initialValue = 1, allocationSize = 1, sequenceName = "demo_data_sequence")
	private int _id ;
	
	private String imei;
	private String data_time;
	private String latitude;
	private String longitude ;
	private String speed;
	private String status ;
	
	
	public DemoData() {

	}


	public DemoData( String imei, String data_time, String latitude, String longitude, String speed,
			String status) {
		super();
	
		this.imei = imei;
		this.data_time = data_time;
		this.latitude = latitude;
		this.longitude = longitude;
		this.speed = speed;
		this.status = status;
	}


	public String getImei() {
		return imei;
	}


	public void setImei(String imei) {
		this.imei = imei;
	}


	public String getData_time() {
		return data_time;
	}


	public void setData_time(String data_time) {
		this.data_time = data_time;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getSpeed() {
		return speed;
	}


	public void setSpeed(String speed) {
		this.speed = speed;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
