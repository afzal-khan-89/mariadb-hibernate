package com.vts.dbhibernate.enitity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="raw_data")
public class RawData {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "raw_data_generator")
	@SequenceGenerator(name="raw_data_generator", initialValue = 1, allocationSize = 1, sequenceName = "raw_data_sequence")
	private Long id;
	
	@Column(nullable = false)
	private String imei;
	
	@Column(name="data_time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataTime;
	
	@Column(name="is_valid", nullable = false)
	private byte isDataValid;
	
	@Column(name = "latitude", nullable= false)
	private double latitude;
	
	@Column(name="longitude", nullable = false)
	private double longitude;
	
	@Column(name="speed", nullable=false)
	private float speed;
	
	@Column(name="fuel", nullable=false)
	private float fuel;
	
	@Column(name="temperature", nullable=false)
	private float temperature;
	
	@Column(name="vehicle_status")
	private int vehicleStatus;

	public RawData() {

	}

	public RawData(String imei, Date dataTime, byte isDataValid, double latitude, double longitude, float speed,
			float fuel, float temperature, int vehicleStatus) {
		super();
		this.imei = imei;
		this.dataTime = dataTime;
		this.isDataValid = isDataValid;
		this.latitude = latitude;
		this.longitude = longitude;
		this.speed = speed;
		this.fuel = fuel;
		this.temperature = temperature;
		this.vehicleStatus = vehicleStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public Date getDataTime() {
		return dataTime;
	}

	public void setDataTime(Date dataTime) {
		this.dataTime = dataTime;
	}

	public byte getIsDataValid() {
		return isDataValid;
	}

	public void setIsDataValid(byte isDataValid) {
		this.isDataValid = isDataValid;
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

	public float getFuel() {
		return fuel;
	}

	public void setFuel(float fuel) {
		this.fuel = fuel;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public int getVehicleStatus() {
		return vehicleStatus;
	}

	public void setVehicleStatus(int vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}


}





































