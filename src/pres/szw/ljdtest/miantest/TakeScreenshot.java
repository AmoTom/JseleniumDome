package pres.szw.ljdtest.miantest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {
public static void main(String[] args) throws Exception {  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.manage().window().maximize();  
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.baidu.com");  
        Thread.sleep(1000);
        driver.findElement(By.id("kw")).sendKeys("121212321");
        // 调用截图方法(获取浏览器窗体内的内容)
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
        	Date day = new Date();
        	SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");
        	String time = df.format(day);
            // 拷贝截图文件到我们项目./Screenshots
        	Files.copy(src, new File(".\\Screenshots"+"\\"+time+".png"));
        }
        catch (IOException e)
         {
        	System.out.println(e.getMessage());
         }
      }
}

