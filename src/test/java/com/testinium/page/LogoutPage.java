package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LogoutPage {
    Methods methods;

    LoginPage loginPage = new LoginPage();
    public LogoutPage(){

        methods = new Methods();
    }

    public void logout(){

        loginPage.login();
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@class='common-sprite' and text()='Merhaba ']"));
        methods.waitBySeconds(3);
        methods.findElement(By.xpath("//a[text()='Çıkış'")).click();
        methods.waitBySeconds(3);
    }
}
