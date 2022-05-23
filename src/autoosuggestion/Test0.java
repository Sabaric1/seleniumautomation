package autoosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement serachtb = driver.findElement(By.name("q"));
serachtb.sendKeys("seleni");

Thread.sleep(3000);

List<WebElement> options = driver.findElements(By.xpath("//li[@class='sbct']"));
System.out.println(options.size());

for(WebElement alloptions:options) {
	System.out.println(alloptions.getText());
}

driver.close();


	}

}
