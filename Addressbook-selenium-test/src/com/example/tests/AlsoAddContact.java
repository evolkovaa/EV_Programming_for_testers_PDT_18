package com.example.tests;

import org.testng.annotations.Test;


public class AlsoAddContact extends TestBase {
	
	
  @Test
  public void AddEmrtyContact() throws Exception {
	openMainPage();
    gotoAddNewContactPage();
    fillNewContactForm(new ContactDate());
    submitContactCreation();
    returnToHomePage(); 
  }
}
