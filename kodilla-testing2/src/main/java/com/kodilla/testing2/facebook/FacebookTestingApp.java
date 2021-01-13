package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIE = "u_0_h";
    public static final String XPATH_BOTTOM = "u_0_2";
    public static final String XPATH_DATE_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_DATE_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_DATE_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        while (!driver.findElement(By.id(XPATH_COOKIE)).isDisplayed());
        WebElement buttonCookie = driver.findElement(By.id(XPATH_COOKIE));
        buttonCookie.click();

        while (!driver.findElement(By.id(XPATH_BOTTOM)).isDisplayed());
        WebElement bottom = driver.findElement(By.id(XPATH_BOTTOM));
        bottom.click();

        Thread.sleep(3000);
        while (!driver.findElement(By.xpath(XPATH_DATE_DAY)).isDisplayed());
        WebElement selectDay = driver.findElement(By.xpath(XPATH_DATE_DAY));
        Select day = new Select(selectDay);
        day.selectByValue("2");

        Thread.sleep(3000);
        while (!driver.findElement(By.xpath(XPATH_DATE_MONTH)).isDisplayed());
        WebElement selectMonth = driver.findElement(By.xpath(XPATH_DATE_MONTH));
        Select month = new Select(selectMonth);
        month.selectByVisibleText("maj");

        Thread.sleep(3000);
        while (!driver.findElement(By.xpath(XPATH_DATE_YEAR)).isDisplayed());
        WebElement selectYear = driver.findElement(By.xpath(XPATH_DATE_YEAR));
        Select year = new Select(selectYear);
        year.selectByValue("1999");
    }
}
