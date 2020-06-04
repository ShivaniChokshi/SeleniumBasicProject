package com.demoaut.newtours.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SignOn;

import utils.GenericMethods;

public class InvalidLoginTest {

	WebDriver driver;

	@BeforeTest
	public void openApplication() {
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void verifyInvalidLogin() throws IOException {
		Login lp = new Login(driver);
		SignOn so = new SignOn(driver);

		String[][] data = GenericMethods.getData("C:\\SHIVANI\\Selenium Java Practice\\Excel for Framework parameter values\\NewtoursTestData.xlsx", "Sheet1");

		for (int i = 0;i < data.length;i++) {
			lp.invalidLogin(data[i][0],data[i][1]); //should be sent from Excel so for now leave it empty
			Boolean signOnLinkVisible = so.signOnLinkVisibility(); //first store the result in a variable
			Assert.assertTrue(signOnLinkVisible); // Next assert whether result is true
			driver.navigate().back();
		}
	}

	@AfterTest
	public void closeApplication() {
		driver.close();
	}

}
