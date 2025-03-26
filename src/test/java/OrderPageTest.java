import edu.prakticum.sprint4.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OrderPageTest {

    private WebDriver webDriver;

    @Before
    public void initWebDriver() {
        webDriver = new FirefoxDriver();
    }

    @Test
    public void testOrderFromTopButtonIvanov() {
        OrderPage page = new OrderPage(webDriver);
        page.open();
        page.clickOrderTopButton();
        page.setName("Денис");
        page.setSurname("Денисов");
        page.setAddress("Сямжа");
        page.setMetro("2");
        page.setPhone("89993333333");
        page.clickNextButton();

        page.setDate("28.03.2025");
        page.setPeriod("4");
        page.setBlackColor();
        page.clickOrderButton();
        page.clickYesButton();

        page.checkSuccessOrder();
    }

    @Test
    public void testOrderFromTopButtonSidorov() {
        OrderPage page = new OrderPage(webDriver);
        page.open();
        page.clickOrderBottomButton();
        page.setName("Иван");
        page.setSurname("Петров");
        page.setAddress("Москва");
        page.setMetro("2");
        page.setPhone("89991111111");
        page.clickNextButton();

        page.setDate("28.03.2025");
        page.setPeriod("1");
        page.setBlackColor();
        page.clickOrderButton();
        page.clickYesButton();

        page.checkSuccessOrder();
    }

    @After
    public void quitWebDriver() {
        webDriver.quit();
    }
}