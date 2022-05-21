package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

driver.navigate().to("https://www.amazon.com/");
//back
Thread.sleep(3000);
driver.navigate().back();

//forword
Thread.sleep(3000);
driver.navigate().forward();

//refresh
Thread.sleep(3000);
driver.navigate().refresh();


	}

}
