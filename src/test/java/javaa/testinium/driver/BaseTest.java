package javaa.testinium.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseTest {

    public static WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-extensions");


         /*DesiredCapabilities: web uygulamalarının çapraz tarayıcı testini gerçekleştirmek için
         tarayıcıların özelliklerini ayarlamak için kullanılan bir Selenium sınıfıdır.;
         */
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        driver = new ChromeDriver(desiredCapabilities);

        driver.manage().window().maximize(); // Full screen tarayıcı için gerekli komut;

        driver.get("https://www.kitapyurdu.com/"); // istek atacağımız web site ismi;


    }

    @After
    public void tearDown() {

        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }


}
