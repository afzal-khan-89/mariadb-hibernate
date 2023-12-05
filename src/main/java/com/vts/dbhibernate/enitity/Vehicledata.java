package com.vts.dbhibernate.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Vehicledata {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long imei;
	private double latitude;
	private double longitude;
	private float speed;
	private byte dtatStatus;
	private String dataTime;
	public Vehicledata() {

	}
	public Vehicledata(Long imei, double latitude, double longitude, float speed, byte dtatStatus, String dataTime) {
		super();
		this.imei = imei;
		this.latitude = latitude;
		this.longitude = longitude;
		this.speed = speed;
		this.dtatStatus = dtatStatus;
		this.dataTime = dataTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getImei() {
		return imei;
	}
	public void setImei(Long imei) {
		this.imei = imei;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public byte getDtatStatus() {
		return dtatStatus;
	}
	public void setDtatStatus(byte dtatStatus) {
		this.dtatStatus = dtatStatus;
	}
	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	@Override
	public String toString() {
		return "Vehicledata [id=" + id + ", imei=" + imei + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", speed=" + speed + ", dtatStatus=" + dtatStatus + ", dataTime=" + dataTime + "]";
	}
	
	
	
}
