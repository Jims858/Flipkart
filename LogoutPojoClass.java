package org.stepdefi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPojoClass extends BaseClass {
	
	public LogoutPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Logout & Sign in to another account']")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(xpath="(//a[@class='_1TOQfO'])[1]")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
}
