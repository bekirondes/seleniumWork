package javaa.testinium.page;

import javaa.testinium.driver.BaseTest;
import javaa.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class ProductPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }


    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        //methods.click(By.xpath("//*[@id=\"product-565088\"]/div[1]/div[2]/a")); // xpath ile yapıldı geri dön!!!
        methods.scrollWithAction(By.cssSelector("#product-572810 > div.grid_7.omega > div.name > a"));
        methods.click(By.cssSelector("#product-572810 > div.grid_2.alpha.omega.relative > div.hover-menu > a.add-to-favorites > i"));
        methods.click(By.cssSelector("#product-565088 > div.grid_2.alpha.omega.relative > div.hover-menu > a.add-to-favorites > i"));
        methods.click(By.cssSelector("#product-561234 > div.grid_2.alpha.omega.relative > div.hover-menu > a.add-to-favorites > i"));
        methods.click(By.cssSelector("#product-577328 > div.grid_2.alpha.omega.relative > div.hover-menu > a.add-to-favorites > i"));
        methods.click(By.cssSelector(".swal2-title.ky-swal-title-single>a"));
        methods.click(By.cssSelector(".logo-text>a"));
    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text: " + attribute);
        logger.info("Alınan text: " + attribute);

    }

    public void textControlTest(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: " + text);
        logger.info("Alınan text: " + text);
    }

    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: " + value);
        logger.info("Alınan text: " + value);

        Assert.assertEquals("testinium", value);
    }
}


