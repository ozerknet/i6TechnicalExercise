package com.i6.step_definitions;

import com.i6.pages.bbcNewsHomePage;
import com.i6.pages.signInPage;
import com.i6.utilities.ConfigurationReader;
import com.i6.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class bbcNewPageStepDefs {

    bbcNewsHomePage bbcNewHome = new bbcNewsHomePage();
    signInPage signInPage = new signInPage();

    @Given("user go to bbc News home page")
    public void user_go_to_bbc_news_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bbcNewsPage"));

    }

    @When("on the news home page check sign in icon and check sub sections of Home text England N.Ireland and Scotland")
    public void on_the_news_home_page_check_sign_in_icon_and_check_sub_sections_of_home_text_england_n_ireland_and_scotland() {
        Assert.assertTrue(bbcNewHome.signInButton.isDisplayed());
        Assert.assertEquals("England", bbcNewHome.textEngland.getText());
        Assert.assertEquals("N. Ireland", bbcNewHome.textNIreland.getText());
        Assert.assertEquals("Scotland", bbcNewHome.textScotland.getText());
    }
    @And("Click on the Sign In icon and assert the following on the page Email or Username Password Sign in Need help signing in?")
    public void click_on_the_sign_in_icon_and_assert_the_following_on_the_page_email_or_username_password_sign_in_need_help_signing_in() {
        bbcNewHome.signInButton.click();

        Assert.assertEquals("Email or username",signInPage.emailOrUsername.getText());
        Assert.assertEquals("Password",signInPage.password.getText());
        Assert.assertEquals("Sign in",signInPage.signIn.getText());
        Assert.assertEquals("Need help signing in?",signInPage.needHelpSignIn.getText());



    }
    @And("Enter a password of {string} in the password field and click Sign In")
    public void enter_a_password_of_in_the_password_field_and_click_sign_in(String password) {
        signInPage.passwordInput.sendKeys(password);
        signInPage.signIn.click();

    }
    @Then("get respond this message {string} and {string}")
    public void get_respond_this_message_and(String msg1, String msg2) {
        String actualText = signInPage.messageAfterSignInClick.getText();
        System.out.println("actualText = " + actualText);

        Assert.assertEquals(msg1,actualText);
        Assert.assertEquals(msg2,actualText);


    }




}
