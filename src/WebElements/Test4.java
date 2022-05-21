package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement serachtb = driver.findElement(By.id("twotabsearchtextbox"));
		
		Dimension s = serachtb.getSize();
		System.out.println(s.getHeight());
		System.out.println(s.getWidth());
		
		driver.close();
		

	}

}
