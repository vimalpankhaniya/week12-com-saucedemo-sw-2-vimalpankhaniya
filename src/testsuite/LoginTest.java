package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class LoginTest extends Utility {
    public static String baseUrl=" https://www.saucedemo.com/ ";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials(){

        sendTextToElement(By.id("user-name"),"standard_user");
        sendTextToElement(By.xpath("//input[@id='password']"),"secret_sauce");
        clickOnElement(By.xpath("//input[@type='submit']"));
        String expectedMessage="PRODUCTS";
        Assert.assertEquals(expectedMessage,getTextFromElement(By.xpath("//span[@class='title']")));

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        // enter Username
       sendTextToElement(By.id("user-name"),"standard_user");
       // enter password
        sendTextToElement(By.xpath("//input[@id='password']"),"secret_sauce");
        // click On Login Button
        clickOnElement(By.xpath("//input[@type='submit']"));
        //boolean isInventoryDisplayed=driver.findElement(By.id("inventory_container")).isDisplayed();
        //System.out.println("all six item displayed" +isInventoryDisplayed);
        int a = 6;
        Assert.assertEquals(a,getValue(By.xpath("//div[@class='inventory_item']")));
    }

}
