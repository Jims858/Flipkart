package org.stepdefi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPojo extends BaseClass{
	
	public ProductSearchPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='Pke_EE']")
	private WebElement searchbox;

	public WebElement getSearchbox() {
		return searchbox;
	}
	
	@FindBy(xpath="//button[@class='_2iLD__']")
	private WebElement searchbutton;

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	@FindBy(xpath="//span[@role='button']")
	private WebElement cut;

	public WebElement getCut() {
		return cut;
	}
}
