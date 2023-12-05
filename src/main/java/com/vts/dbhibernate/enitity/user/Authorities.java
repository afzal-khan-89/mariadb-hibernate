package com.vts.dbhibernate.enitity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class Authorities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "authority_seq_generator")
	@SequenceGenerator(name="authority_seq_generator", initialValue = 1, allocationSize = 1, sequenceName = "authority_generator")
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String username ;

	@Column(length=50, nullable=false)
	private String authority;

	public Authorities() {

	}
	public Authorities(String username, String authority) {
		this.username = username;
		this.authority = authority;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
}
