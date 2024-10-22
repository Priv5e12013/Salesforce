package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesStepsDefinition {

	public ChromeDriver driver;
	
	@Given ("Launch the browser and after load the url and after maximize the screen")
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		
	}
		@And ("Enter into the username dilip@testleaf.com")                                
	    public void enterusername() {                                                      
			driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");   
		}

		@And ("Enter into the password leaf@2024")
	    public void enterpassword() {
			driver.findElement(By.id("password")).sendKeys("leaf@2024");
		}

		@When ("Click on into the login button")
	    public void clickon() {
			driver.findElement(By.id("Login")).click();
		}

		@Then ("My page successfully click the login button")
	    public void vefifymypage() {
			String title = driver.getTitle(); 
			if(title.contains("Home Salesforce")) {
				System.out.println("successful");
			}else {
				System.out.println("not successful");
			}
				
		}
		
		@And ("Click on toggle button")
		public void togglebutton() {
			driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		}
		
		@And ("Click on View AllApplication")
		public void viewallapp() {
			driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		}
		
		@And ("Click on Legal entities")
		public void clickle() {
			driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		}
		
		@And ("Click on new button")
		public void clicknew() {
			driver.findElement(By.xpath("//div[text()='New']")).click();
		}
		
		@And ("Enter the name fielder <LegalEntityName>")
		public void clickname() {
			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Your Priyanka");

		}
		
		@Then ("Enter the save option")
		public void entersave() {
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		}

		@Then ("Verify the legalentity name")
		public void verifyname() {
			String leentity = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Your Priyanka']")).getText();
			if(leentity.contains("priyanka")) {
				System.out.println("The legal name created successfully");
			}else {
				System.out.println("The legal name not created successfully");
			}
		}

}
