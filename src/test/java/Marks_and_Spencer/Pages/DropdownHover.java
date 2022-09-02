package Marks_and_Spencer.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropdownHover {
    WebDriver driver;
    Actions actions = new Actions(driver);
    public DropdownHover(WebDriver driver)
    {
        this.driver = driver;
    }

    public void dropdownHover(String label)
    {
        WebElement dropdown = driver.findElement(By.xpath("//a[contains(@class, 'nav-primary__menu-link icon--hdr-arrow-right') and text() = '"+label+"']"));
        actions.moveToElement(dropdown).build().perform();
    }
}
