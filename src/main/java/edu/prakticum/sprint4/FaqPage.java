package edu.prakticum.sprint4;

import org.openqa.selenium.WebDriver;

public class FaqPage extends AbstractPage {

    private static final String url = "https://qa-scooter.praktikum-services.ru/";

    public FaqPage(WebDriver webDriver) {
        super(url, webDriver);
    }
}
