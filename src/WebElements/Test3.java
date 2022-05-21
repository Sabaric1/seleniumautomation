package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement serachtb = driver.findElement(By.id("twotabsearchtextbox"));
Point loc = serachtb.getLocation();
System.out.println(loc.getX());
System.out.println(loc.getY());

driver.close();
	}

}
