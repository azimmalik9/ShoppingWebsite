package automationWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver;
	By search = By.name("submit_search");
	By searchTerm = By.name("search_query");
	By productName = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void setSearchTerm(String strSearchTerm) {

		
		driver.findElement(searchTerm).sendKeys(strSearchTerm);

	}
	
	//Click on search button

    public void beginSearch(){

            
			driver.findElement(search).click();

    }
    
    public String getProductName(){

        return    driver.findElement(productName).getText();

       }
    
    public void search(String searchTerm) {
    	// Fill search field
    	
    	this.setSearchTerm(searchTerm);
    	
    	// Click Search button

        this.beginSearch();    
    }
}
