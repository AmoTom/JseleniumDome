package pers.szw.ljdtest.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import pers.szw.ljdtest.common.LogType;
import pers.szw.ljdtest.common.Logger;
import pres.szw.ljdtest.miantest.ReadExcels;

public class TestBaidu {
	public static void main(String[] args) throws InterruptedException {
		 ReadExcels recl = new ReadExcels();
		 recl.readexcel(".\\Files\\test-data.xlsx");
		 String yut = recl.getexcelvalue(2);
	     System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
	     WebDriver driver = new ChromeDriver(); 
//	     driver.get("https://www.baidu.com/");
	     Logger.Output(LogType.LogTypeName.INFO, "启动Firefox浏览器");
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     Logger.Output(LogType.LogTypeName.INFO, "设置隐式时间10秒");
	     driver.get("https://test1www.longjulicai.com/");
	     Logger.Output(LogType.LogTypeName.INFO, "打开百度首页");
//	     driver.findElement(By.id("kw")).sendKeys(yut);
//	     Logger.Output(LogType.LogTypeName.INFO, "搜索输入框输入关键字"+yut);
	     driver.findElement(By.id("trusted_hide_image")).click();
	     driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul/li[2]/a")).click();
	     driver.findElement(By.id("txtLoginName")).sendKeys("13671573195");
	     Actions action = new Actions(driver);
	     action.sendKeys(Keys.TAB);
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(".//input[id='txtPassword']")).sendKeys("qwe123");
	     driver.findElement(By.className("sure")).click();
	}
}

