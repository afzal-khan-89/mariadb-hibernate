package com.vts.dbhibernate.enitity.user;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "user")
public class User {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "user_generator")
	@SequenceGenerator(name="user_generator", initialValue = 1, allocationSize = 1, sequenceName = "user_sequence")
	private Long id;
	
	@Column(name="username", nullable = false, unique = true)
	String userName;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="enabled", nullable = false)
	private boolean isEnable;
	
	@Column(name="role", nullable = false)
	private String role;
	
	@Column(name="phone", nullable = false)
	private String phoneNo;
	
	@Column(name="first_name", nullable = false)
	String firstName;
	
	@Column(name="last_name", nullable = false)
	String lastName;
	
	@Column(name="middle_name")
	String middleName;
	
	@Column(name="emil", nullable = false, unique = true)
	private String email;
	
	@Column(name="address_line_one", nullable = false)
	private String addressLineOne;
	
	@Column(name="address_line_two", nullable = false)
	String addressLineTwo;
	
	@Column(name="address_line_three", nullable = false)
	String addressLineThree;
	
    @ManyToMany
    @JoinTable(name = "user_authorities",
           joinColumns = { @JoinColumn(name = "fk_user") },
           inverseJoinColumns = { @JoinColumn(name = "fk_authorities") })
    private Set<Authorities> authorites = new HashSet<Authorities>();

	public User() {

	}

	public User(String userName, String password, boolean isEnable, String role, String phoneNo, String firstName,
			String lastName, String middleName, String email, String addressLineOne, String addressLineTwo,
			String addressLineThree, Set<Authorities> authorites) {
		super();
		this.userName = userName;
		this.password = password;
		this.isEnable = isEnable;
		this.role = role;
		this.phoneNo = phoneNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.addressLineThree = addressLineThree;
		this.authorites = authorites;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getAddressLineThree() {
		return addressLineThree;
	}

	public void setAddressLineThree(String addressLineThree) {
		this.addressLineThree = addressLineThree;
	}

	public Set<Authorities> getAuthorites() {
		return authorites;
	}

	public void setAuthorites(Set<Authorities> authorites) {
		this.authorites = authorites;
	}
	

}































