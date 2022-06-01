package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test6 {

	public static void main(String[] args) {
ChromeOptions options=new ChromeOptions();
options.addArguments("--disbale-notifications");
WebDriver driver=new ChromeDriver(options);


		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
