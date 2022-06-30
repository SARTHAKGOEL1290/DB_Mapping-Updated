package com.DB_Mapping.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class Users {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int Uid;
	  @Column(name="Uname")
	  private String name;
	  @Column(name="Eemail")
	  private  String email;
	  
	  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  @JoinColumn(name ="user_detail")
	  private UserDetail userdetail;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String name, String email, UserDetail userdetail) {
		super();
		this.name = name;
		this.email = email;
		this.userdetail = userdetail;
	}

	public int getUid() {
		return Uid;
	}

	public void setUid(int uid) {
		Uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserDetail getUserdetail() {
		return userdetail;
	}

	public void setUserdetail(UserDetail userdetail) {
		this.userdetail = userdetail;
	}

	@Override
	public String toString() {
		return "Users [Uid=" + Uid + ", name=" + name + ", email=" + email + ", userdetail=" + userdetail + "]";
	}
	  
	  
	  

}
