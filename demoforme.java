package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoforme{
	public static void main (String[] arg) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\AA\\drivers\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tenforce.com/");
		//driver.switchTo().alert().accept();
		//driver.findElement(By.Xpath("")));
		WebElement aboutus=driver.findElement(By.xpath("//*[@class=\"tf-navbar__main-nav tf-navbar__main-nav--main\"]//descendant::span[@class=\"h4 is-dashed-b-b is-permalink relative\"][3]"));
		aboutus.click();
		WebElement career=driver.findElement(By.xpath("//*[@class=\"tf-navbar__main-nav tf-navbar__main-nav--main\"]/child::li[4]/descendant::a[@class=\"h4\"][2]"));
		career.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//nav[@class=\"tenforce[tabs] flex flex-wrap\"]/child::a[text()=\"Life at TenForce\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}
}



