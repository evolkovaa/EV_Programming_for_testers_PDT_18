package com.example.tests;

import org.testng.annotations.Test;

public class AlsoGroupCreationTests extends TestBase{

  @Test
  public void testEmptyGroupCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  app.getNavigationHelper().gotoGroupsPage();
	  app.getGroupHelper().initGroupCreation();
	  app.getGroupHelper().fillGroupForm(new GroupData("", "", ""));
	  app.getGroupHelper().submitGroupCreation();
	  app.getGroupHelper().returnToGroupsPage();
  }

}