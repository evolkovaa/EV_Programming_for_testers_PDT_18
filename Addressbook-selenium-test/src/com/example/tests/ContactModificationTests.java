package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
	
	@Test
	public void modifySomePerson() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactModifications();
		ContactDate contact = new ContactDate();
		contact.firstName = "new first name";
		app.getContactHelper().fillNewContactForm(app, contact);
		app.getContactHelper().updateContact();
		app.getContactHelper().returnToHomePage();
	}
}
