package com.demoblaze.step_definitions;

import com.demoblaze.pages.LoginPage;
import com.demoblaze.pages.PortalPages;
import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MakeAComment {

    LoginPage loginPage = new LoginPage();
    PortalPages portalPages = new PortalPages();
    Actions actions = new Actions(Driver.getDriver());


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
        BrowserUtils.sleep(2);
    }

    @When("user writes the comment in the comment box")
    public void user_writes_the_comment_in_the_comment_box() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        portalPages.commentBoxAfterExtend.sendKeys("hello world");
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user clicks to send button")
    public void user_clicks_to_send_button() {
        portalPages.sendButton.click();
        BrowserUtils.sleep(2);
    }
    @Then("user should see the own comment on the page")
    public void user_should_see_the_own_comment_on_the_page() {
        Assert.assertEquals("hello world", portalPages.messageText.getText());
    }
    @When("user writes the another comment in the comment box")
    public void user_writes_the_another_comment_in_the_comment_box() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        portalPages.commentBoxAfterExtend.sendKeys("hello again");
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().parentFrame();
    }
    @Then("user should see the own another comment on the page")
    public void user_should_see_the_own_another_comment_on_the_page() {
        Assert.assertEquals("hello again", portalPages.messageText2.getText());
    }

    @When("user clicks to like button")
    public void user_clicks_to_like_button() {

        portalPages.likeButton.click();
    }
    @Then("user should see the like emoji on the page")
    public void user_should_see_the_like_emoji_on_the_page() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(portalPages.likeEmoji.isDisplayed());
    }

    @When("user clicks the reply button")
    public void user_clicks_the_reply_button() {
        BrowserUtils.sleep(2);
        portalPages.replyButton.click();

    }
    @When("users types the own reply")
    public void users_types_the_own_replay() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        BrowserUtils.sleep(2);
        portalPages.commentBoxAfterExtend.sendKeys("hello world");
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().parentFrame();

    }

    @When("user clicks to send button again")
    public void user_clicks_to_send_button_again() {
        portalPages.sendButton.click();
        BrowserUtils.sleep(2);
    }

    @When("user hover over the like button which is under the user's own comment")
    public void user_hover_over_the_like_button_which_is_under_the_user_s_own_comment() {
        actions.moveToElement(portalPages.likeButton).perform();
        BrowserUtils.sleep(3);
    }
    @And("user clicks the laugh emoji")
    public void user_clicks_the_laugh_emoji() {
        portalPages.laughEmojiButton.click();
        BrowserUtils.sleep(2);
    }
    @Then("user should see the laugh emoji on the page")
    public void user_should_see_the_laugh_emoji_on_the_page() {
        Assert.assertTrue(portalPages.laughEmojiSign.isDisplayed());
    }

    @When("user click the more button under the comment")
    public void user_click_the_more_button_under_the_comment() {
        BrowserUtils.sleep(1);
        portalPages.moreButton.click();
        BrowserUtils.sleep(2);
    }

    @When("user clicks delete button")
    public void user_clicks_delete_button() {
       portalPages.deleteButton.click();
    }

    @When("user close the alert by click ok")
    public void user_close_the_alert_by_click_ok() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(2);
    }

    @Then("user should see delete message on the page")
    public void user_should_see_delete_message_on_the_page() {
       Assert.assertEquals("Comment deleted", portalPages.deleteMessage.getText());
    }

    @When("user clicks the reviewer's name")
    public void user_clicks_the_reviewer_s_name() {
        BrowserUtils.sleep(2);
        portalPages.firstProfile.click();
    }
    @Then("user should see reviewer's profile")
    public void user_should_see_reviewer_s_profile() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(portalPages.profilePicture.isDisplayed());
    }

    @When("user clicks the star icon")
    public void user_clicks_the_star_icon() {
        portalPages.starIconBeforeClick.click();
            BrowserUtils.sleep(2);
    }
    @Then("star icon's color should change to yellow")
    public void star_icon_s_color_should_change_to_yellow() {
        Assert.assertTrue(portalPages.starIconAfterClick.isDisplayed());

        BrowserUtils.sleep(2);
        portalPages.starIconAfterClick.click();
    }







}
