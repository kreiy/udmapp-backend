package com.udm.udmapp.domain.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Parcours {
	
	 @Id
	 @GeneratedValue
	 @Column(name = "Parcours_Id", nullable = false)
	 private Long ParcoursID;
	 
	 
	 @Column(name = "Parcours_ name", length = 200, nullable = false)
	 private String ParcoursName;
	
	

}
