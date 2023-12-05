package com.vts.dbhibernate.enitity.user;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.vts.dbhibernate.enitity.Asset;
import com.vts.dbhibernate.enitity.AssetGroup;

@Entity
@Table(name="vts_user")
public class VTSUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Column(name="uid", nullable = false, unique = true)
	private Long uid;
	
	@Column(nullable=false, unique=true)
	private String username;
	
	@ManyToOne
	@JoinColumn(name="fk_consortium_id")
	private Consortium consortium ;
	
	
	@ManyToOne
	@JoinColumn(name = "fk_client_id")
	private VtsClient client ;
	
	@OneToMany(mappedBy = "vtsUser")
	private Set<Asset> assets = new HashSet<>();
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vtsUser")
	private List<AssetGroup> assetsGroup =new ArrayList<>();
	
	
	@OneToMany(mappedBy = "vtsUser")
	private Set<VtsUserSupervisor> managers = new HashSet<>();

	public VTSUser() {

	}

	public VTSUser(Long uid, String username, Consortium consortium, VtsClient client, Set<Asset> assets,
			List<AssetGroup> assetsGroup, Set<VtsUserSupervisor> managers) {
		super();
		this.uid = uid;
		this.username = username;
		this.consortium = consortium;
		this.client = client;
		this.assets = assets;
		this.assetsGroup = assetsGroup;
		this.managers = managers;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Consortium getConsortium() {
		return consortium;
	}

	public void setConsortium(Consortium consortium) {
		this.consortium = consortium;
	}

	public VtsClient getClient() {
		return client;
	}

	public void setClient(VtsClient client) {
		this.client = client;
	}

	public Set<Asset> getAssets() {
		return assets;
	}

	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	public List<AssetGroup> getAssetsGroup() {
		return assetsGroup;
	}

	public void setAssetsGroup(List<AssetGroup> assetsGroup) {
		this.assetsGroup = assetsGroup;
	}

	public Set<VtsUserSupervisor> getManagers() {
		return managers;
	}

	public void setManagers(Set<VtsUserSupervisor> managers) {
		this.managers = managers;
	}
	
}




























































