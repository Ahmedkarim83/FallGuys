package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	
	
	WebDriver driver;
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement searchbar= driver.findElement(By.name("q"));
	// searchbar.sendKeys(term);

	@FindBy(css = "input[class='gLFyf gsfi']")
	private WebElement searchbar;

	public void enterTerm(String term) {
		searchbar.sendKeys(term);
	}

	// WebElement searchbtn = driver.findElement(By.name("btnK"));
	// searchbtn.click();

	@FindBy(xpath = "//form[@action='/search']")
	private WebElement searchbtn;

	public void clickSearch() {
		searchbtn.click();
	}

}
