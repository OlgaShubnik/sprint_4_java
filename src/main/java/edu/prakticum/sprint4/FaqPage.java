package edu.prakticum.sprint4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaqPage extends AbstractPage {

    private static final String url = "https://qa-scooter.praktikum-services.ru/";

            // локатор первый вопрос
    private final By firstQuestion = new By.ById("accordion__heading-0");
    private final By firstAnswer = new By.ById("accordion__panel-0");
            // локатор воторой вопрос
    private final By secondQuestion = new  By.ById("accordion__heading-1");
    private final By secondAnswer =  new  By.ById("accordion__panel-1");
            // локатор третий вопрос
    private final By thirdQuestion =  new  By.ById("accordion__heading-2");
    private final By thirdAnswer =  new  By.ById("accordion__panel-2");
            // локатор четвертый вопрос
    private final By fourthQuestion =  new  By.ById("accordion__heading-3");
    private final By fourthAnswer =  new  By.ById("accordion__panel-3");
            // локатор пятый вопрос
    private final By fifthQuestion =  new  By.ById("accordion__heading-4");
    private final By fifthAnswer =  new  By.ById("accordion__panel-4");
            // локатор шестой вопрос
    private final By sixthQuestion =  new  By.ById("accordion__heading-5");
    private final By sixthAnswer =  new  By.ById("accordion__panel-5");
             // локатор седьмой вопрос
    private final By seventhQuestion =  new  By.ById("accordion__heading-6");
    private final By seventhAnswer =  new  By.ById("accordion__panel-6");
            // локатор восьмой вопрос
    private final By eighthQuestion =  new  By.ById("accordion__heading-7");
    private final By eighthAnswer =  new  By.ById("accordion__panel-7");

    public FaqPage(WebDriver webDriver) {
        super(url, webDriver);
    }

    public void navigateToFirstFaq() {
        navigateToElement(firstQuestion);
    }

    public void clickFirstFaq() {
        clickElement(firstQuestion);
    }

    public void checkFirstQuestionText() {
        checkText(firstQuestion, "Сколько это стоит? И как оплатить?");
    }

    public void checkFirstAnswerText() {
        checkText(firstAnswer, "Сутки — 400 рублей. Оплата курьеру — наличными или картой.");
    }

    public void navigateToSecondFaq() {
        navigateToElement(secondQuestion);
    }

    public void clickSecondFaq() {
        clickElement(secondQuestion);
    }

    public void checkSecondQuestionText() {
        checkText(secondQuestion, "Хочу сразу несколько самокатов! Так можно?");
    }

    public void checkSecondAnswerText() {
        checkText(secondAnswer, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.");
    }

    public void navigateToThirdFaq() {
        navigateToElement(thirdQuestion);
    }

    public void clickThirdFaq() {
        clickElement(thirdQuestion);
    }

    public void checkThirdQuestionText() {
        checkText(thirdQuestion, "Как рассчитывается время аренды?");
    }

    public void checkThirdAnswerText() {
        checkText(thirdAnswer, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.");
    }

    public void navigateToFourthFaq() {
        navigateToElement(fourthQuestion);
    }

    public void clickFourthFaq() {
        clickElement(fourthQuestion);
    }

    public void checkFourthQuestionText() {
       checkText(fourthQuestion, "Можно ли заказать самокат прямо на сегодня?");
    }

    public void checkFourthAnswerText() {
        checkText(fourthAnswer, "Только начиная с завтрашнего дня. Но скоро станем расторопнее.");
    }

    public void navigateToFifthFaq() {
        navigateToElement(fifthQuestion);
    }

    public void clickFifthFaq() {
        clickElement(fifthQuestion);
    }

    public void checkFifthQuestionText() {
        checkText(fifthQuestion, "Можно ли продлить заказ или вернуть самокат раньше?");
    }

    public void checkFifthAnswerText() {
        checkText(fifthAnswer, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.");
    }

    public void navigateToSixthFaq() {
        navigateToElement(sixthQuestion);
    }

    public void clickSixthFaq() {
        clickElement(sixthQuestion);
    }

    public void checkSixthQuestionText() {
        checkText(sixthQuestion, "Вы привозите зарядку вместе с самокатом?");
    }

    public void checkSixthAnswerText() {
        checkText(sixthAnswer, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.");
    }

    public void navigateToSeventhFaq() {
        navigateToElement(seventhQuestion);
    }

    public void clickSeventhFaq() {
        clickElement(seventhQuestion);
    }

    public void checkSeventhQuestionText() {
       checkText(seventhQuestion, "Можно ли отменить заказ?");
    }

    public void checkSeventhAnswerText() {
        checkText(seventhAnswer, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.");
    }

    public void navigateToEighthFaq() {
        navigateToElement(eighthQuestion);
    }
    public void clickEighthFaq() {
        clickElement(eighthQuestion);
    }

    public void checkEighthQuestionText() {
        checkText(eighthQuestion, "Я жизу за МКАДом, привезёте?");
    }

    public void checkEighthAnswerText() {
        checkText(eighthAnswer, "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }
}
