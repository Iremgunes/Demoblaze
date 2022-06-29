package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPages extends LoginPage{

    public PortalPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='feed-inform-comments'])[1]")
    public WebElement commentButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement commentBoxAfterExtend;

    @FindBy(id = "lhe_button_submit_sonetCommentFormP8T6")
    public WebElement sendButton;



}
