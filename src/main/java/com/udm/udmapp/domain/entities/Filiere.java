package com.udm.udmapp.domain.entities;




import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Filiere {
	
	
	 @Id
	 @GeneratedValue 	
	 @Column(name = "Filiere_Id", nullable = false)
	 private Long FiliereId;
	 
	 @Column(name = "Filiere_Name", length = 255, nullable = false)
	 private String FiliereName;

	public Long getFiliereId() {
		return FiliereId;
	}

	public void setFiliereId(Long filiereId) {
		FiliereId = filiereId;
	}

	public String getFiliereName() {
		return FiliereName;
	}

	public void setFiliereName(String filiereName) {
		FiliereName = filiereName;
	}

	
	

}
