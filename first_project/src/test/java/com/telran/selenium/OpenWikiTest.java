package com.telran.selenium;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class OpenWikiTest extends TestBase {

    @Test
    public void searchWikiTestHistory()
    {
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("history");

        driver.findElement(By.name("go")).click();
    }
    @Test
    public void searchWikiTestGeography()
    {
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("geography");

        driver.findElement(By.name("go")).click();
    }

}
