package CIA2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest_1 {
	 @Test
	  public void f()throws InterruptedException {
		  	WebDriverManager.chromedriver().setup();
			WebDriver  driver;
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://www.trivago.in/");
			Thread.sleep(2000);
			String actualTitle="trivago.in - Compare hotel prices worldwide";
			String extractedTitle=driver.getTitle();
			AssertJUnit.assertEquals(actualTitle, extractedTitle);
			System.out.println("Page title is Validated.");
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			WebElement ben=driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]"));
			ben.click();
			Thread.sleep(2000);
			WebElement cin=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[2]/time"));
			cin.click();
			Thread.sleep(2000);

			WebElement cout=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[7]/time"));
			cout.click();
			Thread.sleep(2000);
			WebElement inc=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]/span/span[1]"));
			inc.click();
			inc.click();
			inc.click();
			Thread.sleep(2000);
			WebElement pet=driver.findElement(By.id("checkbox-13"));
			pet.click();
			Thread.sleep(3000);
			WebElement apply=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[2]/div/button[2]"));
			apply.click();
			Thread.sleep(3000);
			if(driver.getTitle().equals("Bengaluru (Pet friendly) Hotels | Find & compare great deals on trivago")) {
				System.out.println("1.Verified that the user can enter the location of stay.");
				System.out.println("2.Verified that the user can select the check-in and check-out date.");
				System.out.println("3.Verified that the user can enter the no of rooms based on their preference.");
				
			}
	  }
	
	  
		 


  
}
