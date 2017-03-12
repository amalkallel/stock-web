package com.stock.data;

public class Official {

	protected int idOfficial;
	protected String name;
	protected String firstName;
	protected String phone;
	protected String adress;
	
	
	
	
	public Official(int idOfficial, String name, String firstName, String phone, String adress) {
		super();
		this.idOfficial = idOfficial;
		this.name = name;
		this.firstName = firstName;
		this.phone = phone;
		this.adress = adress;
	}
	
	public int getIdOfficial() {
		return idOfficial;
	}
	public void setIdOfficial(int idOfficial) {
		this.idOfficial = idOfficial;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
}
