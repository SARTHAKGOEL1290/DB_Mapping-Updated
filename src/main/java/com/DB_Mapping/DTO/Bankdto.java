package com.DB_Mapping.DTO;

public class Bankdto {
	
	private String city;
	private String Bname;
	
	public Bankdto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bankdto(String city, String Bname) {
		super();
		this.city = city;
		this.Bname = Bname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBname() {
		return Bname;
	}

	public void setBankname(String Bname) {
		this.Bname = Bname;
	}

	@Override
	public String toString() {
		return "Bankdto [city=" + city + ", bankname=" + Bname + "]";
	}
	
	

}
