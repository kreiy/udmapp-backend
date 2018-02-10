package com.udm.udmapp.domain.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UDMAPP_ROLES")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8111528677867763275L;

	@Id
	@Column(name = "NAME", length = 100)
	private String name;

	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
