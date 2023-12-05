package com.vts.dbhibernate.enitity.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "consortium")
public class Consortium {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Column(unique=true, nullable = false)
	private Long uid;
	
	@Column(name="username", unique=true, nullable = false)
	private String userName;
	
	@ManyToOne
	@JoinColumn(name = "fk_client_id")
	private VtsClient client ;
	
	@OneToMany(mappedBy = "consortium")
	Set<ConsortiumSupervisor> supervisors = new HashSet<>();
	
	
	@OneToMany(mappedBy = "consortium")
	private Set<VTSUser> vtsUser = new HashSet<>();

	public Consortium() {

	}

	public Consortium(Long uid, String userName, VtsClient client, Set<ConsortiumSupervisor> supervisors) {
		this.uid = uid;
		this.userName = userName;
		this.client = client;
		this.supervisors = supervisors;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public VtsClient getClient() {
		return client;
	}

	public void setClient(VtsClient client) {
		this.client = client;
	}

	public Set<ConsortiumSupervisor> getSupervisors() {
		return supervisors;
	}

	public void setSupervisors(Set<ConsortiumSupervisor> supervisors) {
		this.supervisors = supervisors;
	}
	

}
