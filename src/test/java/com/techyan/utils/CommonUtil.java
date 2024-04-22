package com.techyan.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CommonUtil {

    public static void moveToElement(WebDriver wd, WebElementFacade element) {

        JavascriptExecutor js = (JavascriptExecutor) wd;
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView();", element);
        //js.executeScript("window.scrollBy(0,1000)", "");
       // js.executeScript("window.scrollBy(0,1000)");

    }
}
