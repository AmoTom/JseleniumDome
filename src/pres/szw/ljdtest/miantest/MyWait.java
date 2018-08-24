package pres.szw.ljdtest.miantest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWait {
	public static WebElement isElementPresent(WebDriver driver, String id, int time){
		
		WebElement ele = null;
		for(int i=0;i<time;i++){
			try{
				ele = driver.findElement(By.id(id));
				break;
			} catch(Exception e){
				try{
					Thread.sleep(1000);
				} catch(InterruptedException e1){
					System.out.println("Waiting for element to appear on DOM");
				}
			}
		}
		return ele;
	}
}
