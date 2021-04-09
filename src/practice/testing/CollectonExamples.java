package practice.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CollectonExamples {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Seleniumsupportfolder/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		WebElement ele = driver.findElement(By.xpath("//input[@id='usernameField']"));
		ele.sendKeys("dhanashree parit");
		WebElement ele2=driver.findElement(By.xpath("//input[@id='passwordField']"));
		ele2.sendKeys("#parit123");
	
	}

}
;