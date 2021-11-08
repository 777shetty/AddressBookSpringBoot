package com.bridgelabz.addressbookapp.Model;

import com.bridgelabz.addressbookapp.DTO.AddressBookDTO;

public class AddressBookData {
	private int addressBookId;
	private String name;
	private long moNumber;
	private String city;
	private long zip;
	private String email;
	private String state;
	
	public AddressBookData() {}
	
	public AddressBookData(int addressBookId,AddressBookDTO addressBookDTO) {
		this.addressBookId = addressBookId;
		this.name = addressBookDTO.name;
		this.moNumber = addressBookDTO.moNumber;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.email = addressBookDTO.email;
		this.zip = addressBookDTO.zip;
	}
	
	public int getAddressBookId() {
		return addressBookId;
	}
	public void setAddressBookId(int addressBookId) {
		this.addressBookId = addressBookId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public long getMobileNumber() {
		return moNumber;
	}
	public void setMobileNumber(String string) {
		this.moNumber = moNumber;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return this.zip;
	}
	public void getZip(long zip) {
		this.zip = zip;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void setZip(long zip2) {
		
		
	}
}
