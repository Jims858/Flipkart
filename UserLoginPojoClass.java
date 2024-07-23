package org.stepdefi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPojoClass extends BaseClass {
	
	public UserLoginPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@class='_1TOQfO'])[1]")
	private WebElement login;
	
	@FindBy(xpath="//input[@class='r4vIwl BV+Dqf']")
	private WebElement mobno;
	
	@FindBy(xpath="//button[@class='QqFHMw twnTnD _7Pd1Fp']")
	private WebElement otpbut;
	
	@FindBy(xpath="//span[@class='xUWkem']")
	private WebElement edit1;

	public WebElement getEdit1() {
		return edit1;
	}
	public WebElement getLogin() {
		return login;
	}

	public WebElement getMobno() {
		return mobno;
	}

	public WebElement getOtpbut() {
		return otpbut;
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(xpath="(//div[@class='qsHXPi'])[2]")
	private WebElement gender;

	public WebElement getGender() {
		return gender;
	}
	@FindBy(xpath="//button[@class='QqFHMw aMODL0']")
	private WebElement save1;

	public WebElement getSave1() {
		return save1;
	}
	@FindBy(xpath="(//a[@class='I1RPU4 azBkHf'])[1]")
	private WebElement edit2;

	public WebElement getEdit2() {
		return edit2;
	}
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath="//button[@class='QqFHMw wfVVrP G2UnW5']")
	private WebElement save2;

	public WebElement getSave2() {
		return save2;
	}
	@FindBy(xpath="//div[@class='bng0cO row']")
	private WebElement loginsuccessful;

	public WebElement getLoginsuccessful() {
		return loginsuccessful;
	}

}
