package LoginPage;

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
		
		driver.navigate().to(SignUpPage);
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"AccountFrm_firstname\"]"));
		//Actions
		FirstName.sendKeys("Manar");		
	}
}
