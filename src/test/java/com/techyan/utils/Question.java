package com.techyan.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.assertj.core.api.Assertions.assertThat;

public class Question extends PageObject {

    public static void verifyText(WebElementFacade element, String expectedText)
    {
       assertThat(element.getText()).isEqualTo(expectedText);
    }
}
