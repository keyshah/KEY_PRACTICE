package com.eurekaforbes.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    static WebDriver ldriver;
    @FindBy(id = "user-name")
    WebElement txtusername;
    @FindBy(id = "password")
    WebElement txtpassword;
    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/text()[1]")
    WebElement getTxtusername;
    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/text()[1]")
    WebElement textusername;
    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/text()")
    WebElement textpassword;
    @FindBy(id = "login-button")
    WebElement btnloginbutton;


    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    public void enter_username(String username) {
        textusername.sendKeys(username);
    }

	public void enter_password(String password) {
		textusername.sendKeys(password);
	}

    public void click_loginbutton() {
		btnloginbutton.click();
    }

  	public String getusername(){
		return textusername.getText();
	}
	public String getpassword(){
		return textpassword.getText();
	}
}
