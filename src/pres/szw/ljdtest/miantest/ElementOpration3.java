package pres.szw.ljdtest.miantest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOpration3 {
	public static void main(String[] args) throws Exception {  
        System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.manage().window().maximize();  
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("http://jqueryui.com/resources/demos/selectmenu/default.html");  
        Thread.sleep(2000);
        //定位下拉菜单，并选择你想选的选项
        // 点击选中速度这个下拉菜单
        driver.findElement(By.xpath("//*[@id='speed-button']")).click();
        // 一个节点下所有的option选项
        List<WebElement> list = driver.findElements(By.xpath("//*[@id='speed-menu']/li/div"));
        for (WebElement ele : list){
        	if(ele.getText().equals("Fast")){
        		ele.click();
        		break;
        	}
        }
      }
}

