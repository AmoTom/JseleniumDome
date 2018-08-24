package pers.szw.ljdtest.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pers.szw.ljdtest.common.LogType;
import pers.szw.ljdtest.common.Logger;
import pers.szw.ljdtest.common.ReadExcelData;
import pers.szw.ljdtest.data.BaiDuData;
import pers.szw.ljdtest.webdriver.BrowserEngine;

public class TestLaunchBrowser {
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() throws IOException{
		BrowserEngine browserEngine = new BrowserEngine();
		browserEngine.initConfigData();
		driver=browserEngine.getBrowser();
	}

	@Test(dataProvider = "TestDat1",dataProviderClass = BaiDuData.class)
	public void clickNews(String row1,String row2){  
		driver.findElement(By.id("kw")).clear();
		driver.findElement(By.id("kw")).sendKeys(row1+" "+row2);
		Logger.Output(LogType.LogTypeName.DEBUG, "百度输入搜索"+row1 +" "+row2);
		driver.findElement(By.id("su")).click();
		Logger.Output(LogType.LogTypeName.DEBUG, "点击百度搜索按钮......");
//		WebElement we = driver.findElement(By.className("nums_text"));
//		String str = we.getText();
//		System.out.println(str.split("约")[1]);
	}

	@AfterClass
	public void tearDown() throws InterruptedException{
		Thread.sleep(10000);	
		driver.close();
	}
}
