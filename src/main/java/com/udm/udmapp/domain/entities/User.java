package com.udm.udmapp.domain.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "UDMAPP_USERS")
public class User implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -8340744664264027200L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "USERNAME", nullable = false, unique = true, length = 160)
	private String username;

	@Column(name = "PASSWORD", nullable = false, length = 100)
	private String password;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "PHONE_NUMBER", length = 20)
	private String phoneNumber;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "UDMAP_USERS_ROLES", joinColumns = {
			@JoinColumn(name = "ID_USER", referencedColumnName = "ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ROLE_NAME", referencedColumnName = "NAME") })
	private Set<Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
