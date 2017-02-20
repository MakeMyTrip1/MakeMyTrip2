package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class HotelReviewPage  extends MakeMyTripWrappers {	
	
	public HotelReviewPage(RemoteWebDriver driver, ExtentTest test) throws InterruptedException{
		this.driver = driver;
		this.test = test;
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		if(!verifyTitle("Online Hotel Booking for Cheap, Budget & Luxury Hotels in India | MakeMyTrip.com"))
			//if (!verifyURL("hotelz.makemytrip.com/makemytrip")) 
			{
				reportStep("This is not the URL ", "FAIL");
			}
			
//}
}
	//Click on Login & Continue button
			public HotelReviewPage Clickloginbutton(){
				clickByLink("Login & Continue");
				return this;
			}
			
			
	//Enter Email id in sweet alert
			public HotelReviewPage EnterEmailID(String data){
				enterById("username", data);
				driver.findElementById("username").sendKeys(Keys.TAB);
				return this;
			}
			
	//Enter password in sweet alert
			public HotelReviewPage EnterPassword(String data){
		    enterByXpath("//*[@id='password']", data);
				return this;
			}
			
	//Click on continue button in sweet alert
			public HotelReviewPage ClickContinueButton() throws InterruptedException{
			    clickById("login_btn");
			    Thread.sleep(5000);
				return this;
			}
			
			//click continue for login 
			public HotelTravellersPage clickContinue() throws InterruptedException
			{
				clickById("login_btn");
				return new HotelTravellersPage(driver,test);
			}

	//Click on "Continue as Guest" button
			public HotelTravellersPage ClickContinueGuestButton() throws InterruptedException{
			    //clickByXpath("//*[@id='contAsGuest']");
				//clickByXpath("//div[@class='col-lg-3 col-md-3 col-sm-4 col-xs-5 fullWidth append_bottom8']/a");
				clickByLink("Continue as Guest");
				return new HotelTravellersPage(driver,test);
			}
			//click continue after login
			public HotelTravellersPage clickContinueAfterLogin() throws InterruptedException
			{
				Thread.sleep(5000);
				clickByLink("Continue");
				return new HotelTravellersPage(driver,test);
			}
}