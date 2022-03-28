package javaa.testinium.page;

import javaa.testinium.driver.BaseTest;
import javaa.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CatalogPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(CatalogPage.class);

    public CatalogPage() {
        methods = new Methods();
    }


    public void scrollAndSelect() {

        methods.click(By.cssSelector(".lvl1catalog>.common-sprite"));

        methods.click(By.cssSelector("#landing-point > div:nth-child(4) > a:nth-child(2) > img"));
        methods.click(By.cssSelector("#content > div > div > div.product-filter > div > div.sort > select > option:nth-child(6)"));
        methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > span"));
        methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > div > div.open-menu-ct.bookAllCategories > div > ul:nth-child(3) > li:nth-child(14) > a"));


        methods.click(By.cssSelector("#rating-584966 > div > i:nth-child(3)"));
        methods.click(By.cssSelector("#product-584966 > div.hover-menu > a.add-to-cart > i"));
        methods.click(By.cssSelector("#product-276007 > div.image > div > a"));
        methods.click(By.cssSelector("#product-276007 > div.hover-menu > a.add-to-cart > i"));



    }

}
