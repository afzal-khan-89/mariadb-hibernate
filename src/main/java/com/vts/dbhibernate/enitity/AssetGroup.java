package com.vts.dbhibernate.enitity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vts.dbhibernate.enitity.user.VtsUserSupervisor;
import com.vts.dbhibernate.enitity.user.VTSUser;


@Entity
@Table(name="asset_group")
public class AssetGroup {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "asset_group_sequence_generator")
	@SequenceGenerator(name="asset_group_sequence_generator", initialValue = 1, allocationSize = 1, sequenceName = "asset_sequence")
	private Long id;
	
	@Column(name="group_name", nullable = false, unique = true)
	private String groupName;
	
	@ManyToOne
	@JoinColumn(name = "fk_vts_user_id")
	@JsonIgnore
	private VTSUser vtsUser;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "assetGroup")
	Set<Asset> assets = new HashSet<>();
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			name="assetgroup_supervisor",
			joinColumns = @JoinColumn(name="fk_asset_groupid"),
			inverseJoinColumns = @JoinColumn(name="fk_supervisor_id")
	)
	Set<VtsUserSupervisor> assetGroupSupervisor = new HashSet<>();	
	
	public AssetGroup() {

	}
	
	public AssetGroup(String groupName, VTSUser vtsUser, Set<Asset> assets, Set<VtsUserSupervisor> assetGroupSupervisor) {
		super();
		this.groupName = groupName;
		this.vtsUser = vtsUser;
		this.assets = assets;
		this.assetGroupSupervisor = assetGroupSupervisor;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public VTSUser getVtsUser() {
		return vtsUser;
	}
	public void setVtsUser(VTSUser vtsUser) {
		this.vtsUser = vtsUser;
	}
	public Set<Asset> getAssets() {
		return assets;
	}
	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}
	public Set<VtsUserSupervisor> getManagers() {
		return assetGroupSupervisor;
	}
	public void setManagers(Set<VtsUserSupervisor> assetGroupSupervisor) {
		this.assetGroupSupervisor = assetGroupSupervisor;
	}
}

















































