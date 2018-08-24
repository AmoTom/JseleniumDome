package pres.szw.ljdtest.miantest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOpration1 {

	public static void main(String[] args) throws Exception {  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.manage().window().maximize();  
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.jd.com/");  
        Thread.sleep(1000);

        //点击京东左侧菜单中的 手机
        WebElement phone_link = driver.findElement(By.linkText("手机"));
        phone_link.click();
        Thread.sleep(1000);

        //获取当前句柄，如果不相同driver，关闭A页面，driver跳转B页面
        // 获取当前页面句柄  
        String handle = driver.getWindowHandle();  

        // 获取所有页面的句柄，并循环判断不是当前的句柄 
        for (String handles : driver.getWindowHandles()) {  
            if (!handles.equals(handle))  
            driver.close();  
            driver.switchTo().window(handles);  
        }  
        WebElement xiaomi_link = driver.findElement(By.linkText("小米"));
        xiaomi_link.click();
        Thread.sleep(1000);
    }  
}

