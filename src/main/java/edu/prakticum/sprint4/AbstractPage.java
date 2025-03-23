package edu.prakticum.sprint4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public abstract class AbstractPage {

    final String url;
    final WebDriver webDriver;

    protected AbstractPage(String url, WebDriver webDriver) {
        this.url = url;
        this.webDriver = webDriver;
    }

    public void open(){
        webDriver.get(url);
    }

    public void waitElement(By locator) {
        new WebDriverWait(webDriver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void scrollElement(By locator) {
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();",
                webDriver.findElement(locator));
    }

    public void navigateToElement(By locator) {
        scrollElement(locator);
        waitElement(locator);
    }

    public void clickElement(By locator) {
        webDriver.findElement(locator).click();
    }

    public void checkText(By locator, String expected) {
        assertEquals(expected, webDriver.findElement(locator).getText());
    }

    void setField(By locator, String text) {
        webDriver.findElement(locator).clear();
        webDriver.findElement(locator).sendKeys(text);
    }
}
