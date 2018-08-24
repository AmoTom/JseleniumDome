package pres.szw.ljdtest.miantest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImpWoit {
	public WebDriver driver;
	//定位UI元素
    public WebElement getElementBy(String elementType,String expression){
        switch (elementType) {
          case "xpath":
                WebElement xpathelement = driver.findElement(By.xpath(expression));
                return  xpathelement;
          case "id":
                 WebElement idelement = driver.findElement(By.id(expression));
                 return  idelement;
          case "className":
                 WebElement classNameelement = driver.findElement(By.className(expression));
                 return  classNameelement;
          case "linktext": 
                 WebElement linktextelement = driver.findElement(By.linkText(expression));
                 return linktextelement;
          case "name":
                  WebElement nameelement = driver.findElement(By.name(expression));
                  return nameelement;
          case "partialLinkText":
                  WebElement partialLinkTextelement = driver.findElement(By.partialLinkText(expression));
                  return partialLinkTextelement;
          case "cssSelector":
                WebElement cssSelectorelement = driver.findElement(By.cssSelector(expression));
                return cssSelectorelement;
          default:             
                 WebElement element = driver.findElement(By.xpath(expression));
                 return element;
        
        }        
    }
}
