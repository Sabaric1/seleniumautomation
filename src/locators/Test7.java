package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");

driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manger");


driver.findElement(By.xpath("//div[text()='Login ']")).click();

String acttitle = driver.getTitle();
System.out.println(acttitle);

if(acttitle.equals("actiTIME - Login")) {
	System.out.println("Pass:home page is dispalyed");
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
