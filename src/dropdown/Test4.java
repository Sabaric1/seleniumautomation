package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

WebElement month = driver.findElement(By.id("month"));

Select s=new Select(month);
s.selectByIndex(0);
s.selectByValue("3");
s.selectByVisibleText("May");

System.out.println(s.isMultiple());

List<WebElement> alloption = s.getOptions();
System.out.println(alloption.size());

ArrayList a=new ArrayList<>();

for(WebElement opt:alloption) {
	String text = opt.getText();
	System.out.println(text);
	a.add(text);
}

Collections.sort(a);

System.out.println("*********after sorting*********");
for(Object alloptions:a) {
	System.out.println(alloptions);
}


driver.close();

	}

}
