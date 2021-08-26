import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.* ;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private EmailPage emailPage;
    @BeforeTest
    void profileSetup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mail.ru");
    }

    @Test()
    public void testGameSearch() {
        mainPage = new MainPage(driver);
        mainPage.enterUser("userqwerty1234");
        mainPage.pushPasswordButton();
        mainPage.enterPassword("hostpassword");
        mainPage.pushLoginButton();
        emailPage = new EmailPage(driver);
        emailPage.pushWriteLatterButton();
        emailPage.writeLatter("romang83@mail.ru", "testlatter", "Hello Roman!");
        emailPage.pushSendLatterButton();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}