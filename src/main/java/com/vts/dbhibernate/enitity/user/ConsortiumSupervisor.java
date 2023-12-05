package com.vts.dbhibernate.enitity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consortium_supervisor")
public class ConsortiumSupervisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	
	@Column(nullable = false, unique = true)
	private Long uid;
	
	@ManyToOne
	@JoinColumn(name= "fk_consortium")
	Consortium consortium ;

	
	public ConsortiumSupervisor() {

	}


	public ConsortiumSupervisor(Long uid, Consortium consortium) {
		super();
		this.uid = uid;
		this.consortium = consortium;
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


	public Consortium getConsortium() {
		return consortium;
	}


	public void setConsortium(Consortium consortium) {
		this.consortium = consortium;
	}
	
	

}
