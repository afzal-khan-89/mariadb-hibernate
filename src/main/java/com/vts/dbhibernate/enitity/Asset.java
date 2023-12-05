package com.vts.dbhibernate.enitity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vts.dbhibernate.enitity.user.VTSUser;


@Entity
@Table(name="asset")
public class Asset {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "asset_sequence_generator")
	@SequenceGenerator(name="asset_sequence_generator", initialValue = 1, allocationSize = 1, sequenceName = "asset_sequence")
	private Long id;
	
	@Column(name="asset_identity", nullable=false, unique = true)
	@JsonProperty("number_plate")
	private String numberPlate;
	
	@Column(name="asset_type", nullable=false)
	private String type;	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="fk_vts_user_id")
	private VTSUser vtsUser;
	
	@OneToOne
	@JoinColumn(name="fk_device_id", referencedColumnName = "id", unique = true)
	@JsonProperty("device")
	private Device trackingDevice;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="fk_assetgroup")
	AssetGroup assetGroup ;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "asset")
	Set<InstallLog> installLogs = new HashSet<>();
	
	public Asset() {

	}

	public Asset(String numberPlate, String type, VTSUser vtsUser, Device trackingDevice, AssetGroup assetGroup,
			Set<InstallLog> installLogs) {
		super();
		this.numberPlate = numberPlate;
		this.type = type;
		this.vtsUser = vtsUser;
		this.trackingDevice = trackingDevice;
		this.assetGroup = assetGroup;
		this.installLogs = installLogs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public VTSUser getVtsUser() {
		return vtsUser;
	}

	public void setVtsUser(VTSUser vtsUser) {
		this.vtsUser = vtsUser;
	}

	public Device getTrackingDevice() {
		return trackingDevice;
	}

	public void setTrackingDevice(Device trackingDevice) {
		this.trackingDevice = trackingDevice;
	}


	public AssetGroup getAssetGroup() {
		return assetGroup;
	}

	public void setAssetGroup(AssetGroup assetGroup) {
		this.assetGroup = assetGroup;
	}

	public Set<InstallLog> getInstallLogs() {
		return installLogs;
	}

	public void setInstallLogs(Set<InstallLog> installLogs) {
		this.installLogs = installLogs;
	}
	
}



























