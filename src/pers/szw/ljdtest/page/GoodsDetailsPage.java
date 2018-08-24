package pers.szw.ljdtest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pers.szw.ljdtest.common.BasePage;

public class GoodsDetailsPage extends BasePage {
	/*
	 * 商品详情页，价格对比，下单入口等操作
	 */
	@FindBy (xpath="/html/body/")
	WebElement goods_price;
	
	@FindBy (id="InitCartUrl")
	WebElement addToCart_Btn;

	public GoodsDetailsPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * 获取商品详情页的价格
	 */
	public String getPriceOnDetailsPage(){
		return goods_price.getText();
	}

	/*
	 * 点击添加购物车
	 */
	public void addGoodToCart(){
		click(addToCart_Btn);
	}
}

