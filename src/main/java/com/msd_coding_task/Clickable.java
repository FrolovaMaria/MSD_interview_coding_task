package com.msd_coding_task;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 *  1.  https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
 *     *   Start a web driver instance and navigate to the above
 *     *   Assert the title text “Growing Clickable”
 *     *   Click the button
 *     *   Assert the text presented after clicking, “Event Triggered”
 */

public class Clickable {
    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Growing Clickable";
        Assert.assertTrue(actualTitle.contains(expectedTitle));


        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'grown')]")));
        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'grown')]"));
        button.click();


        String expectedMessage = "Event Triggered";
        WebElement eventMessage = driver.findElement(By.xpath("//p[.='Event Triggered']"));
        String actualMessage = eventMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}



