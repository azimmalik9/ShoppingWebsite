package automationWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;

	@FindBy(name="submit_search")
	private WebElement search;
	
	@FindBy(name="search_query")
	private WebElement searchTerm;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	private WebElement productName;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setSearchTerm(String strSearchTerm) {
		searchTerm.sendKeys(strSearchTerm);

	}
	
	//Click on search button

    public void beginSearch(){
			search.click();
    }
    
    public String getProductName(){
        return    productName.getText();
       }
    
    public void search(String searchTerm) {
    	// Fill search field
    	this.setSearchTerm(searchTerm);
    	
    	// Click Search button
        this.beginSearch();    
    }
}
