package pres.szw.ljdtest.miantest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

 

public class ExplicitWait {
	public static void main(String[] args) throws Exception {  
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize();  
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    driver.get("https://www.icloud.com/");  
	    
	    // 创建一个WebDriverWait类的一个对象 wait，设置5，默认单位是秒
	    WebDriverWait wait=new WebDriverWait(driver,5);

	    // 等待知道5秒之后该元素还是不可见，就报错。
	    driver.switchTo().frame("auth-frame");
	    WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account_name_text_field")));
		boolean status = element.isDisplayed();

		// 判断
		if (status) {
			System.out.println("===== 元素可见======");
		} else {
			System.out.println("===== 元素不可见======");
		}
	}
}
