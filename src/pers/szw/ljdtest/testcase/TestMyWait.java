package pers.szw.ljdtest.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pres.szw.ljdtest.miantest.MyWait;

public class TestMyWait {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.baidu.com/");
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  

		 // 用户名输入框输入字段
//		driver.switchTo().frame("auth-frame"); 
		MyWait.isElementPresent(driver,"id=kw", 10).sendKeys("tester");

		// 密码输入框输入字段
//		MyWait.isElementPresent(driver, ".//*[@id='pwd']", 10).sendKeys("123456");
	}
}

