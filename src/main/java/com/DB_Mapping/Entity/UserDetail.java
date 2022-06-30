package com.DB_Mapping.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.criteria.Fetch;

@Entity
@Table(name = "userdetail_info")
public class UserDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int UDid;
	
	private String address;
	private String city;
 
	@OneToOne(fetch = FetchType.LAZY, 
			  cascade = CascadeType.ALL,
			  mappedBy = "userdetail"
			  )
	private Users user;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH,orphanRemoval = true)
	@JoinColumn(name= "FK_detail", referencedColumnName = "UDid")
	private List<Bank> bankdetail = new ArrayList<>();

	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public UserDetail(int uDid, String address, String city, Users user, List<Bank> bankdetail) {
		super();
		UDid = uDid;
		this.address = address;
		this.city = city;
		this.user = user;
		this.bankdetail = bankdetail;
	}



	public int getUDid() {
		return UDid;
	}

	public void setUDid(int uDid) {
		UDid = uDid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}



	public List<Bank> getBankdetail() {
		return bankdetail;
	}



	public void setBankdetail(List<Bank> bankdetail) {
		this.bankdetail = bankdetail;
	}



	@Override
	public String toString() {
		return "UserDetail [UDid=" + UDid + ", address=" + address + ", city=" + city + ", user=" + user
				+ ", bankdetail=" + bankdetail + "]";
	}

	

}
