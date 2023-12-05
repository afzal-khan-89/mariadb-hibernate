package com.vts.dbhibernate.enitity.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vts_client")
public class VtsClient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Column(unique = true)
	private Long uid;
	
	@Column(unique = true)
	private String username;
	
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	Set<Consortium> consortiums = new HashSet<>();
	
	@OneToMany(mappedBy = "client", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Set<ClientAdmin> admins = new HashSet<>();
	
	@OneToMany(mappedBy = "client")
	private Set<VTSUser> vtsUser = new HashSet<>();
	
	public VtsClient() {

	}

	public VtsClient(Long uid, String username, Set<Consortium> consortiums, Set<ClientAdmin> admins) {
		super();
		this.uid = uid;
		this.username = username;
		this.consortiums = consortiums;
		this.admins = admins;
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

	public Set<Consortium> getConsortiums() {
		return consortiums;
	}

	public void setConsortiums(Set<Consortium> consortiums) {
		this.consortiums = consortiums;
	}

	public Set<ClientAdmin> getAdmins() {
		return admins;
	}

	public void setAdmins(Set<ClientAdmin> admins) {
		this.admins = admins;
	}
	
}
