package com.techyan.utils;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SeleniumUtil extends PageObject {


    public static void enterText(WebElementFacade element,String text)
    {
        element.sendKeys(text);
    }

    public static void submit(WebElementFacade element)
    {
        element.click();
    }


    }


