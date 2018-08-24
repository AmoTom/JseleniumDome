package pres.szw.ljdtest.miantest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class ElementOpration {
	public static void main(String[] args) throws Exception {  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.manage().window().maximize();  
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://blog.csdn.net/u011541946");  
        Thread.sleep(1000);

        //通过查找底部元素，使页面滑动到最底部
        // 定义csdn底部 公司简介 这个元素
        WebElement element = driver.findElement(By.partialLinkText("举报中心"));

        //创建一个javascript 执行实例
      	JavascriptExecutor je = (JavascriptExecutor) driver;

      	//执行js语句，拖拽浏览器滚动条，直到该元素到底部，找到该元素为止
      	je.executeScript("arguments[0].scrollIntoView(true);",element);
    }  
}
