package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToCreateNewCustomer() {
		driver =BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSigninButton();
		// next validation 
		
		 DashboardPage dashboardPage = PageFactory.initElements(driver,  DashboardPage.class);
		 dashboardPage.validateDashboardPage("Dashboard");
		 dashboardPage.clickCustomerMenuElement();
		 dashboardPage.ClickAddCustomerMenuElement();
		 
		 AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		 addCustomerPage.validateAddContactPage("Add Contact");
		 addCustomerPage.insertFullName("Selenium Feb2022");
		 addCustomerPage.selectCompany("Techfios");
		 addCustomerPage.insertEmail("abc@techfios.com");
		
		
		 
		 
	}

}
