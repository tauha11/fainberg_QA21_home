package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginWikiTest extends TestBase{

    @Test
    public void loginWikiTest()
    {
    driver.findElement(By.id("pt-login")).click();

    driver.findElement(By.id("wpName1")).click();
    driver.findElement(By.id("wpName1")).clear();
    driver.findElement(By.id("wpName1")).sendKeys("qwertyuu");

    driver.findElement(By.id("wpPassword1")).click();
    driver.findElement(By.id("wpPassword1")).clear();
    driver.findElement(By.id("wpPassword1")).sendKeys("1q2w3e4r5t");

    driver.findElement(By.name("wploginattempt")).click();

    }
}
