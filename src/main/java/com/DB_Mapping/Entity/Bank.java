package com.DB_Mapping.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bank_info")
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Bid;
	@Column(name ="bankname")
	private String Bname;
	@Column(name = "branch")
	private String branch;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	//private UserDetail user;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String bname, String branch) {
		super();
		Bname = bname;
		this.branch = branch;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Bank [Bid=" + Bid + ", Bname=" + Bname + ", branch=" + branch + "]";
	}
	
	

}
