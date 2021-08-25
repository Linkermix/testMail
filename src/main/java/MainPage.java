import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginField = By.xpath("//*[@id=\"mailbox\"]/form[1]/div[1]/div[2]/input");
    private By passwordField = By.xpath("//*[@id=\"mailbox\"]/form[1]/div[2]/input");
    private By loginButton = By.xpath("//*[@id=\"mailbox\"]/form[1]/button[2]");
    private By enterPasswordButton = By.xpath("//*[@id=\"mailbox\"]/form[1]/button[1]");

    public void enterUser(String user) { driver.findElement(loginField).sendKeys(user); }

    public void pushPasswordButton() { driver.findElement(enterPasswordButton).click(); }

    public void enterPassword(String password) { driver.findElement(passwordField).sendKeys(password); }

    public void pushLoginButton() { driver.findElement(loginButton).click(); }
}
