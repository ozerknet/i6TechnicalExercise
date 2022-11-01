package com.i6.pages;

import com.i6.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bbcNewsHomePage {

    public bbcNewsHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "idcta-link")
    public WebElement signInButton;

    @FindBy(linkText = "England")
    public WebElement textEngland;

    @FindBy(linkText = "N. Ireland")
    public WebElement textNIreland;

    @FindBy(linkText = "Scotland")
    public WebElement textScotland;

}
