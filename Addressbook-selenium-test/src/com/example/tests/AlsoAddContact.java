package com.example.tests;

import org.testng.annotations.Test;


public class AlsoAddContact extends TestBase {
	
	
  @Test
  public void AddEmrtyContact() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  app.getNavigationHelper().gotoAddNewContactPage();
	  app.getContactHelper().fillNewContactForm(new ContactDate());
	  app.getContactHelper().submitContactCreation();
	  app.getContactHelper().returnToHomePage(); 
  }
}
