package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.apache.commons.codec.digest.XXHash32;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPages extends LoginPage{

    public PortalPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='feed-inform-comments'])[1]")
    public WebElement commentButton;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe']")
    public WebElement frameWebElement;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement commentBoxAfterExtend;

    @FindBy(xpath = "//button[starts-with(@id, 'lhe_button_submit')]")
    public WebElement sendButton;

    @FindBy(xpath = "//*[starts-with(@id, 'record-BLOG_')]/div[.='hello world']")
    public WebElement messageText;

    @FindBy(xpath = "(//span[@class='bx-ilike-left-wrap'])[1]")
    public WebElement likeButton;

    @FindBy(xpath = "//span[starts-with(@data-like-id, 'BLOG_POST')]")
    public WebElement likeEmoji;

    @FindBy(xpath = "//div[@data-reaction='laugh']")
    public WebElement laughEmojiButton;

    @FindBy(xpath = "//span[starts-with(@data-like-id, 'BLOG_POST')]")
    public WebElement laughEmojiSign;

    @FindBy(xpath = "//a[starts-with(@id, 'record-BLOG_')]")
    public WebElement replyButton;

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[2]")
    public WebElement moreButton;

    @FindBy(xpath = "(//span[.='Delete'])[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[.='Comment deleted']")
    public WebElement deleteMessage;

    @FindBy(xpath = "(//a[@class='feed-post-user-name'])[1]")
    public WebElement firstProfile;

    @FindBy(xpath = "//span[@class='user-profile-img-default user-default-avatar']")
    public WebElement profilePicture;







}
