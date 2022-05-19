package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.id("product-494424"));
        methods.waitBySeconds(3);
        //Favorilere ekleyemediğim için o kısmı atlayarak devam ettim.
        methods.findElement(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']")).click();
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".lvl1catalog>a"));
        methods.waitBySeconds(3);
        methods.findElement(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']")).click();
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//select[@onchange='location = this.value;']"),
                "Yüksek Oylama");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//span[@class='mn-strong common-sprite' and text()='Tüm Kitaplar']")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[@class='mn-icon icon-angleRight' and text()='Hobi']")).click();
        methods.waitBySeconds(2);
        methods.randomProductSelect();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[@class='common-sprite' and text()='Listelerim']")).click();
        methods.findElement(By.xpath("//a[text()='Favorilerim']")).click();
        methods.waitBySeconds(2);

        //bekletme işlemini kullanmak zorunda kaldım yoksa bazen hata verebiliyordu.




    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),
                "title");
        System.out.println("Alınan text: " + attribute);
        logger.info("Alınan text: " + attribute);
        methods.waitBySeconds(3);
    }

    public void textControlTest(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: " + text);
        logger.info("Alınan text: " + text);
        methods.waitBySeconds(3);
    }

    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: " + value);
        logger.info("Alınan text: " + value);
        Assert.assertEquals("testinium", value);
        methods.waitBySeconds(5);
    }


}
