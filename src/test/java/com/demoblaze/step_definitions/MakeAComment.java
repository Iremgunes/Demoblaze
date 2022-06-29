package com.demoblaze.step_definitions;

import com.demoblaze.pages.LoginPage;
import com.demoblaze.pages.PortalPages;
import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MakeAComment {

    LoginPage loginPage = new LoginPage();
    PortalPages portalPages = new PortalPages();

    @Given("user is on the marketing portal page")
    public void user_is_on_the_marketing_portal_page() {
        Driver.getDriver().get("https://qa.bleucrm.com/stream/");
        loginPage.loginBox.sendKeys("marketing2@cybertekschool.com");
        loginPage.passwordBox.sendKeys("UserUser");
        loginPage.loginButton.click();

    }
    @When("user clicks to comment button")
    public void user_clicks_to_comment_button() {
        portalPages.commentButton.click();

    }
    @When("user writes the comment in the comment box")
    public void user_writes_the_comment_in_the_comment_box() {
        Driver.getDriver().switchTo().frame(portalPages.commentBoxAfterExtend);
        BrowserUtils.sleep(2);
        portalPages.commentBoxAfterExtend.sendKeys("hello world");

    }
    @When("user clicks to send button")
    public void user_clicks_to_send_button() {
        portalPages.sendButton.click();

    }
    @Then("user should see the own comment on the page")
    public void user_should_see_the_own_comment_on_the_page() {

    }



}
