package com.techyan.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PageSelectElement extends PageObject {

    @FindBy(xpath="//span[@class='text'][contains(.,'Text Box')]")
    private WebElementFacade ELEMENTS_EDIT_TEXT;

    @FindBy(id="userName")
    public WebElementFacade EDIT_USERNAME;
    @FindBy(id="submit")
    public WebElementFacade BTN_SUBMIT;
    @FindBy(id="name")
    public WebElementFacade LBL_NAME;

    public void selectTextElementToEdit() {
        ELEMENTS_EDIT_TEXT.click();
    }

}
