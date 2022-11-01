package com.i6.pages;

import com.i6.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bbcNewHome {

    public bbcNewHome(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "idcta-link")
    public WebElement signInButton;

}
