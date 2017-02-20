package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.MakeMyTripWrappers;

public class HotelSelect extends MakeMyTripWrappers{

	
	public HotelSelect(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("MakeMyTrip")){
			reportStep("This is not MakeMyTrip page ", "FAIL");
}
	
}
	//Select a hotel which is displayed
	public RoomSelectPage ClickHotel() throws InterruptedException{
		//clickByXpathNoSnap("//img[@class='img-responsive']");
		clickByXpathNoSnap("(//div[@class='card__BArea'])[1]");
		switchToLastWindow();
		return new RoomSelectPage(driver,test);
	}
}

