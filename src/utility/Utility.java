package utility;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {


    public void clickOnElement (By by){
        driver.findElement(by).click();
    }
    public String  getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
    public void sendTextToElement(By by, String text){
        // Find the element email field
        driver.findElement(by).sendKeys(text);
}
   public int getValue(By by){
        int xpathCount = driver.findElements(by).size();
        return xpathCount;
        
}
}