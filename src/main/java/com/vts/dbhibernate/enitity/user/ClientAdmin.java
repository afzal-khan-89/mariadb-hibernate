package com.vts.dbhibernate.enitity.user;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="client_admin")
public class ClientAdmin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Column(unique=true, nullable=false)
	private Long uid ;
	
	@Column(unique=true, nullable=false)
	private String username ;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_client")
	private VtsClient client;

	public ClientAdmin() {
	}

	public ClientAdmin(Long uid, String username, VtsClient client) {
		super();
		this.uid = uid;
		this.username = username;
		this.client = client;
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

	public VtsClient getClient() {
		return client;
	}

	public void setClient(VtsClient client) {
		this.client = client;
	}

}
