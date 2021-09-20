package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "q";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.pl");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement agree = driver.findElement(By.xpath("//button[@id=\"L2AGLb\"]"));
        agree.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
