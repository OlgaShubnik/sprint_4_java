import edu.prakticum.sprint4.OrderPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OrderPageTest {

    @Test
    public void testOrderFromTopButtonIvanov() {
        WebDriver webDriver = new FirefoxDriver();
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

        webDriver.quit();
    }

    @Test
    public void testOrderFromTopButtonSidorov() {
        WebDriver webDriver = new FirefoxDriver();
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

        webDriver.quit();
    }
}