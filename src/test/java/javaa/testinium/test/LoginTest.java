package javaa.testinium.test;
import javaa.testinium.driver.BaseTest;
import javaa.testinium.page.LoginPage;
import org.junit.Test;

public class LoginTest extends  BaseTest {
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
