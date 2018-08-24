package pres.szw.ljdtest.miantest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComAction {
public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.baidu.com");
		//模拟用户使用键盘的组合键，例:Ctrl+t，打开新页面
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"t"));
		Thread.sleep(2);
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "t"));
	}
}

