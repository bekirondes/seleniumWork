package javaa.testinium.test;

import javaa.testinium.driver.BaseTest;
import javaa.testinium.page.CatalogPage;
import javaa.testinium.page.HomePage;
import javaa.testinium.page.LoginPage;
import javaa.testinium.page.ProductPage;
import org.junit.Test;

public class CatalogTest extends BaseTest {

    @Test
    public void productTest(){
        LoginPage loginPage =new LoginPage();
        CatalogPage catalogPage = new CatalogPage();
        loginPage.login();

        catalogPage.scrollAndSelect();



    }

    @Test
    public void getAttribute(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }

    @Test
    public void getTextTest(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        homePage.home();
        loginPage.login();
        productPage.textControlTest();
    }

    @Test
    public void valueTest(){
        ProductPage productPage = new ProductPage();

        productPage.valueControlTest();
    }
}
