package com.example.fw;

import org.openqa.selenium.By;
import com.example.tests.ContactDate;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitContactCreation() {
	    click(By.name("submit"));
	}

	public void fillNewContactForm(ContactDate contact) {
		type(By.name("firstname"), contact.firstName);
		type(By.name("lastname"), contact.lastName);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.phoneHome);
		type(By.name("mobile"), contact.phoneMobile);
	    type(By.name("work"), contact.phoneWork);
		type(By.name("email"), contact.mail_1);
		type(By.name("email2"), contact.mail_2);
		//selectByText(By.name("GroupName"), contact.groupName);
		type(By.name("address2"), contact.address2);
		type(By.name("phone2"), contact.home2);
	}

	public void inputOfDate(String bday, String bmonth, String year) {
		selectByText(By.name("bday"), bday);
		selectByText(By.name("bmonth"), bmonth);
		type(By.name("byear"), year);
	}

	public void returnToHomePage() {
	    click(By.linkText("home page"));
	}

}
