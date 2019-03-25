import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleTest {
	@Test
	public void Login() {
		
		// To declare and initialize HtmlUnitDriver
		 WebDriver driver = new HtmlUnitDriver();
		 //WebDriver driver = new HtmlUnitDriver(BrowserVersion.)
		 // Set implicit wait 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 // Open "Google.com and search SoftwareTestingMaterial.com"
		 driver.get("https://www.google.com");
		 WebElement element = driver.findElement(By.name("q"));
		 element.sendKeys("softwaretestingmaterial.com");
		 element.submit();
		 //Click on Software Testing Material link
		 driver.findElement(By.linkText("Software Testing Material")).click();
		 // Get the title of the site and store it in the variable Title
		 String Title = driver.getTitle();
		 // Print the title
		 System.out.println("I am at " +Title);
		 }
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		//WebDriver driver = new HtmlUnitDriver();
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		
		//driver.findElement(By.name("q")).sendKeys("secret");
		//driver.findElement(By.name("btnK")).click();
		
		//driver.close();
		
	}


