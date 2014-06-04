package com.example.tests;

import org.testng.annotations.Test;


public class ContactCreation extends TestBase {
	
	
  @Test
  public void testAddNewContact() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().gotoAddNewContactPage();
    ContactDate contact = new ContactDate();
	contact.firstName = "First name";
	contact.lastName = "Last name";
	contact.address = "Address";
	contact.phoneHome = "123";
	contact.phoneMobile = "123";
	contact.phoneWork = "123";
	contact.mail_1 = "mail@mail.ru";
	contact.mail_2 = "mail@mail.ru";
	contact.bday = "1";
	contact.bmonth = "January";
    contact.year = "2014";
	contact.groupName = "new_group";
	contact.address2 = "Address";
	contact.home2 = "123";
    app.getContactHelper().fillNewContactForm (app,contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage(); 
  }
  
  @Test
  public void testAddEmrtyContact() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().gotoAddNewContactPage();
    app.getContactHelper().fillNewContactForm(app, new ContactDate());
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage(); 
  }
}
