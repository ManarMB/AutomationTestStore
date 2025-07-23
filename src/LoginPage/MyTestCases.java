package LoginPage;

import java.util.Random;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {


	WebDriver driver = new ChromeDriver();
	String WebsiteURL = "https://automationteststore.com/";
	String SignUpPage = "https://automationteststore.com/index.php?rt=account/create";
	
	@BeforeTest
	public void mySetup() {
		
		driver.get(WebsiteURL);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void SignUp () {
		
		//Elements
		driver.navigate().to(SignUpPage);
		WebElement FirstNameInput = driver.findElement(By.xpath("//*[@id=\"AccountFrm_firstname\"]"));
		WebElement LastNameInput = driver.findElement(By.id("AccountFrm_lastname"));
		WebElement EmailInput = driver.findElement(By.id("AccountFrm_email"));
		WebElement TelephoneInput = driver.findElement(By.id("AccountFrm_telephone"));
		WebElement FaxInput = driver.findElement(By.id("AccountFrm_fax"));
		WebElement CompanyInput = driver.findElement(By.id("AccountFrm_company"));
		WebElement AddressInput1 = driver.findElement(By.id("AccountFrm_address_1"));
		WebElement AddressInput2 = driver.findElement(By.id("AccountFrm_address_2"));
		WebElement CityInput = driver.findElement(By.id("AccountFrm_city"));
		WebElement PostalCodeInput = driver.findElement(By.id("AccountFrm_postcode"));
		WebElement LoginName = driver.findElement(By.id("AccountFrm_loginname"));
		WebElement Password = driver.findElement(By.id("AccountFrm_password"));
		WebElement PasswordConfirmation = driver.findElement(By.id("AccountFrm_confirm"));

		
		
		//data 
		Random rand = new Random();
		
		String [] FirstNames = {"Manar","Malak","Mahmoud","Mureed","Maryam"};
		int randomIndexFirstName = rand.nextInt(FirstNames.length);
		String RandomFirstName = FirstNames[randomIndexFirstName];
		
		String [] LastNames = {"Ahmad","Omar","Ali"};
		int randomIndexLastName = rand.nextInt(LastNames.length);
		String RandomLastName = LastNames[randomIndexLastName];
		
		int RandomNumberForEmail = rand.nextInt(10000);
		String Email = RandomFirstName+RandomLastName+RandomNumberForEmail+"@gmail.com";
		String Telephone = "4765872465826";
		String Fax = "4765872465826";
		String Company = "abc";
		String Address1 = "Amman";
		String Address2 = "Khalda";
		String City = "Amman";
		String PostalCode = "8234";
		String PasswordInput = "Test@1234";
		
		//Actions
		FirstNameInput.sendKeys(RandomFirstName);
		LastNameInput.sendKeys(RandomLastName);	
		EmailInput.sendKeys(Email);
		TelephoneInput.sendKeys(Telephone);
		FaxInput.sendKeys(Fax);
		CompanyInput.sendKeys(Company);
		AddressInput1.sendKeys(Address1);		
		AddressInput2.sendKeys(Address2);		
		CityInput.sendKeys(City);		
		PostalCodeInput.sendKeys(PostalCode);
		LoginName.sendKeys(RandomFirstName+RandomLastName+RandomNumberForEmail);
		Password.sendKeys(PasswordInput);
		PasswordConfirmation.sendKeys(PasswordInput);
		
		
	}
}
