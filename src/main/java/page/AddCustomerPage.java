package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage  extends BasePage{
	
	WebDriver driver;
//	in this page creat driver we havet to do constractur page
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	//identife each element 
	
	@FindBy(how = How.XPATH, using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement ADD_CONTACT_HEADER;
	@FindBy(how = How.XPATH, using="//*[@id=\"account\"]")WebElement Full_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using="//*[@id=\"cid\"]")WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using="//*[@id=\"email\"]")WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using="//*[@id=\"phone\"]")WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using="//*[@id=\"address\"]")WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using="//*[@id=\"city\"]")WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using="//input[@id = 'state']")WebElement state_ELEMENT;
	
	
	public void validateAddContactPage(String addContactHeader) {  //WE HAVE TO PARAMETERIZED HERE 
		Assert.assertEquals(ADD_CONTACT_HEADER.getText(),addContactHeader ,"Add Contact page is not avalible");
		
	}
	public void insertFullName(String fullName) {
		int genNum =  generateRandomNo(999);
		Full_NAME_ELEMENT.sendKeys(fullName + genNum);
		
		 //after we use basePge we can inheart basePge in this bage and the issuse will be gone all the commen methiod put inside on the base bage 
		// inheartans is esier to make object
	}
	public void selectCompany (String company) {
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT,company);
		}
	
	public void insertEmail(String email){
		EMAIL_ELEMENT.sendKeys(generateRandomNo(9999) + email);
		{
	}
}
}
