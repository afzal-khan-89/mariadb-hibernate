package com.vts.dbhibernate.enitity.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.vts.dbhibernate.enitity.AssetGroup;

@Entity
@Table(name="vts_user_supervisor")
public class VtsUserSupervisor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Column(nullable=false, unique=true)
	private Long uid;
	
	@ManyToOne
	@JoinColumn(name = "fk_vts_user")
	private VTSUser vtsUser;
	

	@ManyToMany(mappedBy = "assetGroupSupervisor")
	private Set<AssetGroup> assetGroups = new HashSet<>();
	
	public VtsUserSupervisor() {

	}
	public VtsUserSupervisor(Long uid, VTSUser vtsUser, Set<AssetGroup> assetGroups) {
		super();
		this.uid = uid;
		this.vtsUser = vtsUser;
		this.assetGroups = assetGroups;
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

	public VTSUser getVtsUser() {
		return vtsUser;
	}

	public void setVtsUser(VTSUser vtsUser) {
		this.vtsUser = vtsUser;
	}
	public Set<AssetGroup> getAssetGroups() {
		return assetGroups;
	}
	public void setAssetGroups(Set<AssetGroup> assetGroups) {
		this.assetGroups = assetGroups;
	}
	
}
