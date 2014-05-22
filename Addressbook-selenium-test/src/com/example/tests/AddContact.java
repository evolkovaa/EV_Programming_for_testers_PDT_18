package com.example.tests;

import org.testng.annotations.Test;


public class AddContact extends TestBase {
	
	
  @Test
  public void testAddNewContact() throws Exception {
	openMainPage();
    gotoAddNewContactPage();
    ContactDate contact = new ContactDate();
	contact.firstName = "First name";
	contact.lastName = "Last name";
	contact.address = "Address";
	contact.phoneHome = "123";
	contact.phoneMobile = "123";
	contact.phoneWork = "123";
	contact.mail_1 = "mail@mail.ru";
	contact.mail_2 = "mail@mail.ru";
	contact.bday = "bday";
	contact.bmonth = "bmonth";
    contact.year = "2000";
	contact.contactInGroup = "new_group";
	contact.address2 = "Address";
	contact.home2 = "123";
	
    fillNewContactForm(contact);
    submitContactCreation();
    returnToHomePage(); 
  }
}
