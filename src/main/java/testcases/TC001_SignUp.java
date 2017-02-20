package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dashboard;
import wrappers.MakeMyTripWrappers;

public class TC001_SignUp extends MakeMyTripWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Signup";
		testDescription = "To verify user is able to sign up by providing mandatory details";
		category = "smoke";
		authors = "Vignesh";
		url="https://www.makemytrip.com/flights-hotels/";
		dataSheetName = "TC001";
	}
		//@Test(dataProvider="fetchData")
		@Test
		public void SignUp()
		{
			new Dashboard(driver, test)
			.clickLoginMenu()
			.clickCreateNewUser()
			.enterNewEmailId("bbbvig@yopmail.com")
			.enterNewPassword("bbbvig")
			.enterConfirmPassword("bbbvig")
			.clickIAgree()
			.clickCreateAccountButton();				
		}
		
	
}
