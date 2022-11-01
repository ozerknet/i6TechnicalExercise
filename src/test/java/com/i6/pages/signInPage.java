package com.i6.pages;

import com.i6.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage {

    public signInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement emailOrUsername;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(id = "submit-button")
    public WebElement signIn;

    @FindBy(linkText = "Need help signing in?")
    public WebElement needHelpSignIn;

    @FindBy(xpath = "//p[@class='form-message__text']")
    public WebElement messageAfterSignInClick;

}
