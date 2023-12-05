package com.vts.dbhibernate.enitity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.vts.dbhibernate.util.InstallType;

@Entity
@Table(name="install_log")
public class InstallLog {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "install_log_sequence_generator")
	@SequenceGenerator(name="install_log_sequence_generator", initialValue = 1, allocationSize = 1, sequenceName = "install_log_sequence")
	private Long id;
	
	@Column(name="device", nullable=false)
	private String deviceImei;
	
	@Column(name="status")
	@Enumerated(EnumType.ORDINAL)
	private InstallType status;
	
	@Column(name="time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date time;
	
	@Column(name="technician", nullable = false)
	private String technician;
	
	@Column(name="place_address", nullable = false)
	private String placeAddress;
	
	@Column(name ="old_device")
	private String oldDevice;
	
	
	@ManyToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;
	
	public InstallLog() {

	}

	public InstallLog(String deviceImei, InstallType status, Date time, String technician, String placeAddress,
			String oldDevice, Asset asset) {
		super();
		this.deviceImei = deviceImei;
		this.status = status;
		this.time = time;
		this.technician = technician;
		this.placeAddress = placeAddress;
		this.oldDevice = oldDevice;
		this.asset = asset;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeviceImei() {
		return deviceImei;
	}

	public void setDeviceImei(String deviceImei) {
		this.deviceImei = deviceImei;
	}

	public InstallType getStatus() {
		return status;
	}

	public void setStatus(InstallType status) {
		this.status = status;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getTechnician() {
		return technician;
	}

	public void setTechnician(String technician) {
		this.technician = technician;
	}

	public String getPlaceAddress() {
		return placeAddress;
	}

	public void setPlaceAddress(String placeAddress) {
		this.placeAddress = placeAddress;
	}
 
	public String getOldDevice() {
		return oldDevice;
	}

	public void setOldDevice(String oldDevice) {
		this.oldDevice = oldDevice;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

}





































