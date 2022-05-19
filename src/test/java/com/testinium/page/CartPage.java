package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    Methods methods;

    public CartPage() {

        methods = new Methods();

    }

    public void goToCart(){

        driver.findElement(By.id("js-cart")).click();
        //sepet ile uğraşmaya vakit yetmedi :(

    }

}
