package org.stepdefi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPojoClass extends BaseClass {

	public RegistrationPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='_1TOQfO'])[1]")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(xpath="//input[@class='r4vIwl BV+Dqf']")
	private WebElement mobno;

	public WebElement getMobno() {
		return mobno;
	}
	@FindBy(xpath="//button[@class='QqFHMw twnTnD _7Pd1Fp']")
	private WebElement otpbut;

	public WebElement getOtpbut() {
		return otpbut;
	}
	@FindBy(xpath="//a[@class='azBkHf']")
	private WebElement link;

	public WebElement getLink() {
		return link;
	}	
}
