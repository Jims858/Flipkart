package org.stepdefi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPurchasePojo extends BaseClass {
	
	public ProductPurchasePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='KzDlHZ'])[11]")
	private WebElement clkproduct;
	public WebElement getClkproduct() {
		return clkproduct;
	}
	@FindBy(xpath="//button[@class='QqFHMw vslbG+ In9uk2']")
	private WebElement addtocart;
	public WebElement getAddtocart() {
		return addtocart;
	}
	@FindBy(xpath="//button[@class='QqFHMw zA2EfJ _7Pd1Fp']")
	private WebElement placeorder;
	public WebElement getPlaceorder() {
		return placeorder;
	}
	@FindBy(xpath="//input[@class='r4vIwl Jr-g+f']")
	private WebElement entermob;
	public WebElement getEntermob() {
		return entermob;
	}
	@FindBy(xpath="//button[@class='QqFHMw YhpBe+ _7Pd1Fp']")
	private WebElement contin;
	public WebElement getContin() {
		return contin;
	}
}
