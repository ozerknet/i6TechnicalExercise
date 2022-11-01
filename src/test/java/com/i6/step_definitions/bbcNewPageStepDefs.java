package com.i6.step_definitions;

import com.i6.pages.bbcNewHome;
import com.i6.utilities.ConfigurationReader;
import com.i6.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bbcNewPageStepDefs {

    bbcNewHome bbcNewHome = new bbcNewHome();

    @Given("user go to bbc News home page")
    public void user_go_to_bbc_news_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bbcNewsPage"));

    }

    @When("on the new home page check sign in icon")
    public void on_the_new_home_page_check_sign_in_icon() {
        bbcNewHome.signInButton.click();

    }

    @Then("on the new home page check sub sections of Home text England N.Ireland and Scotland")
    public void on_the_new_home_page_check_sub_sections_of_home_text_england_n_ireland_and_scotland() {


    }


}
