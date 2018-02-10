package com.udm.udmapp.domain.entities;


import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class UserAccess {
	
	    @Id
	    @GeneratedValue
	    @Column(name = "Id", nullable = false)
	    private Long id;
	    
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "User_Id", nullable = false)
	    private User user;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "Access_id", nullable = false)
	    private Role access;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Role getAccess() {
			return access;
		}

		public void setAccess(Role access) {
			this.access = access;
		}

}
