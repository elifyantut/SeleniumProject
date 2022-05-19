package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage(){

        methods = new Methods();

    }

    public void login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.sendKeys(By.id("login-email"),"elifnur.yantut@testinium.com");
        methods.sendKeys(By.xpath("//input[@id='login-password']"),"1el2if3nur");
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));

    }
}
