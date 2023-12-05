package com.vts.dbhibernate.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="device")
public class Device {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "device_sequence_generator")
	@SequenceGenerator(name="device_sequence_generator", initialValue = 1, allocationSize = 1, sequenceName = "device_sequence")
	Long id;
	
	@Column(nullable=false, unique = true)
	String imei;
	
	@Column(name="origin")
	String origin ;
	
	@Column(name="model")
	String model;
	
	@JsonIgnore
	@OneToOne( mappedBy = "trackingDevice")
	private Asset ownerAssets;


	public Device() {
	
	}

	public Device(String imei, String origin, String model, Asset ownerAssets) {

		this.imei = imei;
		this.origin = origin;
		this.model = model;
		this.ownerAssets = ownerAssets;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public Asset getOwnerAssets() {
		return ownerAssets;
	}

	public void setOwnerAssets(Asset ownerAssets) {
		this.ownerAssets = ownerAssets;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
