package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePageObjects;

public class FallGuysGoogleSearch extends GoogleBase {
	
	HomePageObjects hpo;
	
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		//LaunchBrowser();
		
		LaunchBrowser();
		
		
	    
	}

	@When("I enter search {string}")
	public void i_enter_search(String term) {
		//WebElement searchbar= driver.findElement(By.name("q"));
		//searchbar.sendKeys(term);
		hpo = new HomePageObjects(driver);
		hpo.enterTerm(term);
		
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		//WebElement searchbtn = driver.findElement(By.name("btnK"));
		//searchbtn.click();
		
		
		hpo.clickSearch();	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		String title = driver.getTitle();
		System.out.println(title);
		
		closeBrowswer();
		
		
	
		
	}


	    


	
	
	
}
