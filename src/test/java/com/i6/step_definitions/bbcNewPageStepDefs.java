package com.i6.step_definitions;

import com.i6.pages.bbcNewsHomePage;
import com.i6.pages.signInPage;
import com.i6.utilities.ConfigurationReader;
import com.i6.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class bbcNewPageStepDefs {

    bbcNewsHomePage bbcNewHome = new bbcNewsHomePage();
    signInPage signInPage = new signInPage();

    @Given("user go to bbc News home page")
    public void user_go_to_bbc_news_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bbcNewsPage"));

    }

    @When("on the news home page check sign in icon")
    public void on_the_news_home_page_check_sign_in_icon() {
        Assert.assertTrue(bbcNewHome.signInButton.isDisplayed());

    }

    @When("check sub sections of Home {string}")
    public void check_sub_sections_of_home(String subSection) {

        bbcNewHome.subSectionTextControl(subSection);

    }


    @When("Click on the Sign In icon and assert the following on the page check webElements")
    public void click_on_the_sign_in_icon_and_assert_the_following_on_the_page_check_web_elements() {

        bbcNewHome.signInButton.click();


        Assert.assertEquals("Email or username", signInPage.emailOrUsername.getText());
        Assert.assertEquals("Password", signInPage.password.getText());
        Assert.assertEquals("Sign in", signInPage.signIn.getText());
        Assert.assertEquals("Need help signing in?", signInPage.needHelpSignIn.getText());


    }

    @When("Enter a password of {string} in the password field and click Sign In")
    public void enter_a_password_of_in_the_password_field_and_click_sign_in(String password) {
        signInPage.passwordInput.sendKeys(password);
        signInPage.signIn.click();

    }

    @Then("get respond this message {string}")
    public void get_respond_this_message(String message) {
        String actualText = signInPage.messageAfterSignInClick.getText();
        System.out.println("actualText = " + actualText);

        Assert.assertEquals(message, actualText);

   }




}
