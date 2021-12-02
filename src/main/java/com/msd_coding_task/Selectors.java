package com.msd_coding_task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * https://testpages.herokuapp.com/styled/challenges/hard-selectors.html
 * *   Start a web driver instance and navigate to the above
 * *   Assert the title text “Challenging Selectors”
 * *   Click the button
 * *   Assert the text presented after clicking, “Event Triggered”
 */
public class Selectors {
    @Test
    public void challengingSelectors() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/challenges/hard-selectors.html");


        driver.getTitle().equals("Challenging Selectors");

        driver.findElement(By.xpath("//button[@id='select.me.by.id']")).click();
        String expectedMessage = "Event Triggered";
        WebElement eventMessage = driver.findElement(By.xpath("//p[@id='select.me.by.idstatus' and text()='Event Triggered']"));
        String actualMessage = eventMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
