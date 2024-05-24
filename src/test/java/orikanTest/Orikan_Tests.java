package orikanTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Orikan_Tests extends Orikan_Base {

	@Test
	public void orikanTestCases() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Verify Landed on Registration Page Assertion
		String actualRegPage = driver.findElement(By.xpath("//div[text()='Registration']")).getText();
		String expectedRegPage = "Registration";
		Assert.assertEquals(expectedRegPage, actualRegPage);

		// Register Tab
		orikanobj.enterUsername("adam@orikan.com");
		orikanobj.enterPassword("Arsapogu");
		orikanobj.confirmPassword("Arsapogu");
		orikanobj.clickNext();

		// Get the toast message
		String actualToastMsg = driver.findElement(By.xpath("//div[@class='toast-message success expiring']"))
				.getText();
		String expectedToastMsg = "Email address is already Registered";

		// Verify the toast message
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualToastMsg, expectedToastMsg);

		// Verify Landed on Contact Page Assertion
		String actualConPage = driver.findElement(By.xpath("//div[text()='Contact']")).getText();
		String expectedConPage = "Contact";
		Assert.assertEquals(actualConPage, expectedConPage);

		// Contact Tab
		orikanobj.enterFirstname("David");
		orikanobj.enterLastname("Arsapogu");
		orikanobj.enterAddressLine1("One");
		orikanobj.enterAddressLine2("Two");
		orikanobj.enterPostCode("4551");
		orikanobj.enterCity("Caloundra Bc");
		orikanobj.selectState();
		orikanobj.clickNext2();

		// Verify Landed on Payment Page Assertion
		String actualPayPage = driver.findElement(By.xpath("//div[text()='Payment']")).getText();
		String expectedPayPage = "Payment";
		Assert.assertEquals(actualPayPage, expectedPayPage);

		// Payments Tab
		orikanobj.entercardHolderName("David Arsapogu");
		orikanobj.clickVisaRadio();
		orikanobj.entercardNumber("81665985458965");
		orikanobj.enterCVV("56933");
		orikanobj.selectExpireMonth();
		orikanobj.enterExpireYear("2018");
		orikanobj.clickNext3();

		// Verify Landed on Terms & Conditions Page Assertion
		String actualTerPage = driver.findElement(By.xpath("//div[text()='Terms & Conditions']")).getText();
		String expectedTerPage = "Terms & Conditions";
		Assert.assertEquals(actualTerPage, expectedTerPage);

		orikanobj.scrollDown();
		orikanobj.checkTerms();
		orikanobj.clickSubmit();

		String actualMessage = driver.findElement(By.xpath("//div[@class='toast-message success expiring']")).getText();
		String expectedMessage = "Email address is already Registered";
		Assert.assertEquals(actualMessage, expectedMessage);

	}

}
