package com.i6.pages;

import com.i6.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class bbcNewsHomePage {

    public bbcNewsHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void subSectionTextControl(String sub) {
        String sub_locator = "//ul[@class='gs-o-list-ui--top-no-border nw-c-nav__secondary-sections']//a[span='" + sub + "']";
        WebElement subSectionElement = Driver.getDriver().findElement(By.xpath(sub_locator));
        Assert.assertEquals(sub,subSectionElement.getText());
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
