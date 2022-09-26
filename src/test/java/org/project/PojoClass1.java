package org.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass1 extends BaseClass {
	
public PojoClass1() {
		
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="(//a[text()='Sign In'])[1]")
    private WebElement signin;
    
    @FindBy(xpath="(//a[text()='Sign In'])[2]")
	private WebElement sign1;
	

	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}

	public WebElement getSign1() {
		return sign1;
	}

	public void setSign1(WebElement sign1) {
		this.sign1 = sign1;
	}

	@FindBy(id="login-button")
	private WebElement btnlogin;

	
    //getter setter method
	public WebElement getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(WebElement txtUser) {
		this.txtUser = txtUser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(WebElement txtpass) {
		this.txtpass = txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void setBtnlogin(WebElement btnlogin) {
		this.btnlogin = btnlogin;
	}
	
	

}



