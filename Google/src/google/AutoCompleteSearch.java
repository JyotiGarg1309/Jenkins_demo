package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteSearch {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/ExeDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("weather");
		Thread.sleep(3000);
		List <WebElement> all = driver.findElements(By.xpath("//div[@class='aajZCb']/ul//li[@class='sbct' and @role='presentation']"));
		System.out.println(all.size());
		 for(int i=0;i<all.size();i++){
	            System.out.println(all.get(i).getText());
	        }
		 
		 driver.quit();

	
	}

}
