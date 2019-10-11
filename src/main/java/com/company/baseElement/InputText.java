package com.company.baseElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public  class InputText extends CustomWebElement {


    /**
     * Constructor.
     *
     * @param webDriver The webDriver used to interact with the webbrowser.
     * @param by        The locator used to identify the element(s) on the website.
     **/
    public InputText(WebDriver webDriver, By by) {
        super(webDriver, by);
    }


    /**
     * Returns the text of this textfield.
     *
     * @return Returns the text of this textfield.
     **/
    public String getText() {
        return getAttribute("value");
    }

    /**
     * Sets the text of this textfield.
     *
     * @param text The text which should be inserted in this text field.
     **/
    public void setText(String text) {
        getWebDriver().findElement(getBy()).clear();
        getWebDriver().findElement(getBy()).sendKeys(text);
    }

    /**
     * Tries to submit by pressing enter.
     */
    public void submit() {
        getWebDriver().findElement(getBy()).sendKeys(Keys.ENTER);
    }
}
