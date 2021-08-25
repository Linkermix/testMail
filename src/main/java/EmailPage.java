import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.NumberFormat;
import java.util.List;


public class EmailPage {

    private WebDriver driver;

    public EmailPage(WebDriver driver) {
        this.driver = driver;
    }

    private By writeLatterButton = By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/span/div[1]/div[1]/div/div/div/div[1]/div/div/a/span/span");
    private By adressField = By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div/div[2]/div/div/label/div/div/input");
    private By themeField = By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div/input");
    private By latterField = By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[1]");
    private By sendLatterButton = By.xpath("/html/body/div[15]/div[2]/div/div[2]/div[1]/span[1]/span/span");

    public void pushWriteLatterButton() {  driver.findElement(writeLatterButton).click(); }

    public void writeLatter(String adress, String theme, String text) {

        driver.findElement(adressField).sendKeys(adress);
        driver.findElement(themeField).sendKeys(theme);
        driver.findElement(latterField).sendKeys(text);

    }
    public void pushSendLatterButton() {
        driver.findElement(sendLatterButton).click();
    }
}

