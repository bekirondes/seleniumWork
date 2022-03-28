package javaa.testinium.test;

import javaa.testinium.page.HomePage;
import org.junit.Test;

public class HomeTest {

    @Test
    public void HomeTest() {
        HomePage homePage = new HomePage();
        homePage.home();
    }
}
