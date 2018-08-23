package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import automationWebsite.Homepage;

public class TestHomeSearch {

	WebDriver driver;
	Homepage home;

	@Before

	public void setup() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");


	}

	/**
	 * 
	 * This test case will enter a search query in
	 * http://automationpractice.com/index.php
	 * 
	 * Assert that a particular item was found
	 * 
	 */


	@Test
	public void test_Home_Page_Appear_Correct() {

		// Create User Page object
		home = new Homepage(driver);

		// search for a product
		home.setSearchTerm("t-shirt");

		home.beginSearch();

		// Verify product is visible
		Assert.assertTrue(home.getProductName().contains("Faded Short Sleeve T-shirts"));

	}

	@After
	public void close() {
		driver.close();
	}
}
