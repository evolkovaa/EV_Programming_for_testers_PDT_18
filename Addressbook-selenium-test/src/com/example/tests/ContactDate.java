package com.example.tests;

public class ContactDate {
	public String firstName;
	public String lastName;
	public String address;
	public String phoneHome; 
	public String phoneMobile;
	public String phoneWork;
	public String mail_1;
	public String mail_2;
	public String bday;
	public String bmonth;
	public String year;
	public String contactInGroup;
	public String address2;
	public String home2;
	
	public ContactDate() {
	}

	public ContactDate(String first, String last, String address,
			String phoneHome, String phoneWork, String phoneMobile, String mail_1,
			String mail_2, String bday, String bmonth, String year,
			String contactInGroup, String address2, String home2) {
		this.firstName = first;
		this.lastName = last;
		this.address = address;
		this.phoneHome = phoneHome;
		this.phoneMobile = phoneMobile;
		this.phoneWork = phoneWork;
		this.mail_1 = mail_1;
		this.mail_2 = mail_2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.year = year;
		this.contactInGroup = contactInGroup;
		this.address2 = address2;
		this.home2 = home2;
	}
}