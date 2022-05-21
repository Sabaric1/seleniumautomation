package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
WebElement user = driver.findElement(By.name("username"));
wait.until(ExpectedConditions.visibilityOf(user)).sendKeys("admin");
		
WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[3]"));
		


		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		String title = driver.getTitle();
		
wait.until(ExpectedConditions.titleContains("instagram"));		
		System.out.println(title);
		
		if(title.equals("Instagram")) {
			System.out.println("Pass:home page is displyed");
		}
		
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	}

}
