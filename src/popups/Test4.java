package popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		
	//	driver.findElement(By.id("email")).sendKeys("4565rttg");
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		ArrayList a=new ArrayList<>();
		
		for(String b:child) {
		
		a.add(b);
		
		}
		a.indexOf(0);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("23456789");
		
	}

}
