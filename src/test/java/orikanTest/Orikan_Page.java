package orikanTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Orikan_Page {

	WebDriver driver;

	public Orikan_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Register Tab
	@FindBy(xpath = "//input[@id='emailAddress']")
	WebElement txt_emailAddress;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txt_password;

	@FindBy(xpath = "//input[@id='confirmPassword']")
	WebElement txt_confirmPassword;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement btn_next;

	public void enterUsername(String uName) {
		txt_emailAddress.sendKeys(uName);
	}

	public void enterPassword(String pWord) {
		txt_password.sendKeys(pWord);
	}

	public void confirmPassword(String cPWord) {
		txt_confirmPassword.sendKeys(cPWord);
	}

	public void clickNext() {
		btn_next.click();
	}

	// Contact Tab
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement txt_firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement txt_lastName;

	@FindBy(xpath = "//input[@id='addressLine1']")
	WebElement txt_addressLine1;

	@FindBy(xpath = "//input[@id='addressLine2']")
	WebElement txt_addressLine2;

	@FindBy(xpath = "//input[@id='postcode']")
	WebElement txt_postcode;

	@FindBy(xpath = "//input[@id='city']")
	WebElement txt_city;

	@FindBy(xpath = "//select[@id='state']")
	WebElement drpdwn_state;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement btn2_next;

	public void enterFirstname(String fName) {
		txt_firstName.sendKeys(fName);
	}

	public void enterLastname(String lName) {
		txt_lastName.sendKeys(lName);
	}

	public void enterAddressLine1(String aLine1) {
		txt_addressLine1.sendKeys(aLine1);
	}

	public void enterAddressLine2(String aLine2) {
		txt_addressLine2.sendKeys(aLine2);
	}

	public void enterPostCode(String pCode) {
		txt_postcode.sendKeys(pCode);
	}

	public void enterCity(String city) {
		txt_city.sendKeys(city);
	}

	public void selectState() {
		Select dropdown = new Select(drpdwn_state);
		dropdown.selectByVisibleText("Queensland");
	}

	public void clickNext2() {
		btn2_next.click();
	}

	// Payments Tab
	@FindBy(xpath = "//input[@id='cardHolderName']")
	WebElement txt_cardHolderName;

	@FindBy(xpath = "//input[@id='cardTypeVISA']")
	WebElement radio_visa;

	@FindBy(xpath = "//input[@id='cardNumber']")
	WebElement txt_cardNumber;

	@FindBy(xpath = "//input[@id='cardCVV']")
	WebElement txt_cardCVV;

	@FindBy(xpath = "//select[@id='cardExpiryMonth']")
	WebElement drpdwn_cardExpiryMonth;

	@FindBy(xpath = "//input[@id='cardExpiryYear']")
	WebElement txt_cardExpiryYear;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement btn_next3;

	public void entercardHolderName(String cHName) {
		txt_cardHolderName.sendKeys(cHName);
	}

	public void clickVisaRadio() {
		radio_visa.click();
	}

	public void entercardNumber(String cNumber) {
		txt_cardNumber.sendKeys(cNumber);
	}

	public void enterCVV(String cVV) {
		txt_cardCVV.sendKeys(cVV);
	}

	public void selectExpireMonth() {
		Select dropdownMonth = new Select(drpdwn_cardExpiryMonth);
		dropdownMonth.selectByVisibleText("January");
	}

	public void enterExpireYear(String expiryYear) {
		txt_cardExpiryYear.sendKeys(expiryYear);
	}

	public void clickNext3() {
		btn_next3.click();
	}

	// Terms & Conditions
	@FindBy(xpath = "//input[@id='agreedToTerms']")
	WebElement checkbox_terms;

	@FindBy(xpath = "//textarea[@id='termsAndConditions']")
	WebElement scrl_down;

	@FindBy(xpath = "//input[@id='agreedToTerms']")
	WebElement agreedToTerms;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement btn_submit;

	public void scrollDown() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scrl_down);
	}

	public void checkTerms() {
		agreedToTerms.click();
	}

	public void clickSubmit() {
		btn_submit.click();
	}

}
