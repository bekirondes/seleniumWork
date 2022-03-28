package javaa.testinium.page;

import javaa.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.sendKeys(By.id("login-email"), "bekirondes008@gmail.com");
        methods.sendKeys(By.id("login-password"), "bekir007");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(25);




    }


}
