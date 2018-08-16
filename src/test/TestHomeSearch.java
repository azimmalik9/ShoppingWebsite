package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automationWebsite.Homepage;

	public class TestHomeSearch {

		WebDriver driver;
		Homepage home;

		@BeforeTest

		public void setup() {

			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("http://automationpractice.com/index.php");

		}
		
		/**
		 * 
		 * This test case will enter a search query in http://automationpractice.com/index.php
		 * 
		 * Assert that a particular item was found
		 * 
		 */

		@Test(priority = 0)
		public void test_Home_Page_Appear_Correct() {

			// Create User Page object

			home = new Homepage(driver);

			// search for a product

			home.setSearchTerm("t-shirt");

			home.beginSearch();


			// Verify product is visible

			Assert.assertTrue(home.getProductName().contains("Faded Short Sleeve T-shirts"));

		}

	}

