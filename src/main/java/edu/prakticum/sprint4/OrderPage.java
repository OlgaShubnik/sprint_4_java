package edu.prakticum.sprint4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPage extends AbstractPage {

    private static final String url = "https://qa-scooter.praktikum-services.ru/";

    private final By orderTopButton = By.xpath("//div[@class='Header_Nav__AGCXC']//button[text()='Заказать']"); // кнопка заказать вверху
    private final By orderBottomButton = By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[text()='Заказать']"); //вторая кнопка заказать
    private final By nameInput = By.xpath("//input[@placeholder='* Имя']"); // имя
    private final By surnameInput = By.xpath("//input[@placeholder='* Фамилия']"); //фамилия
    private final By addressInput = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']"); //адрес куда привезти
    private final By metroInput = By.xpath("//input[@placeholder='* Станция метро']");// станция метро
    private final By phoneInput =  By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");// телефон
    private final By nextButton = By.xpath("//button[text()='Далее']"); //далее
    private final By dateInput = By.xpath("//input[@placeholder='* Когда привезти самокат']"); // когда привезти
    private final By periodInput = By.xpath("//div[@class='Dropdown-control']"); // срок аренды
    private final By blackColor =  By.id("black");
    private final By greyColor = By.id("grey");
    private final By orderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']//button[text()='Заказать']"); //заказать
    private final By yesButton = By.xpath("//button[text()='Да']"); // да
    private final By cookieButton = By.xpath("//button[text()='да все привыкли']"); // да все привыкли
    private final By successOrderLabel = By.xpath("//div[@class='Order_Modal__YZ-d3']//div[contains(text(), 'Заказ оформлен')]"); // заказ оформлен

    public OrderPage(WebDriver webDriver) {
        super(url, webDriver);
    }

    public void clickCookieButton() {
        try {
            clickElement(cookieButton);
        } catch (Exception ignore) {
            //ignore
        }
    }

    public void clickOrderTopButton() {
        clickCookieButton();
        waitElement(orderTopButton);
        clickElement(orderTopButton);
    }

    public void clickOrderBottomButton() {
        clickCookieButton();
        scrollElement(orderBottomButton);
        waitElement(orderBottomButton);
        clickElement(orderBottomButton);
    }

    public void setName(String name) {
        setField(nameInput, name);
    }

    public void setSurname(String surname) {
        setField(surnameInput, surname);
    }

    public void setAddress(String address) {
        setField(addressInput, address);
    }

    public void setMetro(String metro) {
        clickElement(metroInput);
        clickElement(By.xpath("//ul[@class='select-search__options']/li[" + metro + "]"));
    }

    public void setPhone(String phone) {
        setField(phoneInput, phone);
    }

    public void clickNextButton() {
        clickCookieButton();
        scrollElement(nextButton);
        waitElement(nextButton);
        clickElement(nextButton);
    }

    public void setDate(String date) {
        setField(dateInput, date);
        webDriver.findElement(dateInput).sendKeys(Keys.ENTER);
    }

    public void setPeriod(String period) {
        clickElement(periodInput);
        clickElement(By.xpath("//div[@class='Dropdown-menu']/div[" + period + "]"));
    }

    public void setBlackColor() {
        clickElement(blackColor);
    }

    public void setGreyColor() {
        clickElement(greyColor);
    }

    public void clickOrderButton() {
        clickCookieButton();
        clickElement(orderButton);
    }

    public void clickYesButton() {
        scrollElement(yesButton);
        waitElement(yesButton);
        clickElement(yesButton);
    }

    public void checkSuccessOrder() {
        waitElement(successOrderLabel);
    }
}
