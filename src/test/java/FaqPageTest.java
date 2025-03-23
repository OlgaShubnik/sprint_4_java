import edu.prakticum.sprint4.FaqPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaqPageTest {

    @Test
    public void testFirstQuestion() {
        WebDriver webDriver = new FirefoxDriver();
        FaqPage page = new FaqPage(webDriver);
        page.open();
        page.navigateToFirstFaq();
        page.clickFirstFaq();
        page.checkFirstQuestionText();
        page.checkFirstAnswerText();
        webDriver.quit();
    }

    @Test
    public void testSecondQuestion() {
        WebDriver webDriver = new FirefoxDriver();
        FaqPage page = new FaqPage(webDriver);
        page.open();
        page.navigateToSecondFaq();
        page.clickSecondFaq();
        page.checkSecondQuestionText();
        page.checkSecondAnswerText();
        webDriver.quit();
    }

    @Test
    public void testThirdQuestion() {
        WebDriver webDriver = new FirefoxDriver();
        FaqPage page = new FaqPage(webDriver);
        page.open();
        page.navigateToThirdFaq();
        page.clickThirdFaq();
        page.checkThirdQuestionText();
        page.checkThirdAnswerText();
        webDriver.quit();
    }

    @Test
    public void testFourthQuestion() {
        WebDriver webDriver = new FirefoxDriver();
        FaqPage page = new FaqPage(webDriver);
        page.open();
        page.navigateToFourthFaq();
        page.clickFourthFaq();
        page.checkFourthQuestionText();
        page.checkFourthAnswerText();
        webDriver.quit();
    }

    @Test
    public void testFifthQuestion() {
        WebDriver webDriver = new FirefoxDriver();
        FaqPage page = new FaqPage(webDriver);
        page.open();
        page.navigateToFifthFaq();
        page.clickFifthFaq();
        page.checkFifthQuestionText();
        page.checkFifthAnswerText();
        webDriver.quit();
    }

    @Test
    public void testSixthQuestion() {
        WebDriver webDriver = new FirefoxDriver();
        FaqPage page = new FaqPage(webDriver);
        page.open();
        page.navigateToSixthFaq();
        page.clickSixthFaq();
        page.checkSixthQuestionText();
        page.checkSixthAnswerText();
        webDriver.quit();
    }

    @Test
    public void testSeventhQuestion() {
        WebDriver webDriver = new FirefoxDriver();
        FaqPage page = new FaqPage(webDriver);
        page.open();
        page.navigateToSixthFaq();
        page.clickSeventhFaq();
        page.checkSeventhQuestionText();
        page.checkSeventhAnswerText();
        webDriver.quit();
    }

    @Test
    public void testEighthQuestion() {
        WebDriver webDriver = new FirefoxDriver();
        FaqPage page = new FaqPage(webDriver);
        page.open();
        page.navigateToSixthFaq();
        page.clickEighthFaq();
        page.checkEighthQuestionText();
        page.checkEighthAnswerText();
        webDriver.quit();
    }
}
