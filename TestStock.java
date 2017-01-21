import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestStock {
    @BeforeClass
    public static void setupChromeDriverLocation()
    {
        String chromeDriverLocation = "/Users/Mega_S/Downloads/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
    }

    @Test
    public void LoginSukses() {
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://automationpractice.com/");
        chrome.findElement(By.linkText("Sign in")).click();
        chrome.findElement(By.id("email")).sendKeys("ghij@gmail.com");
        chrome.findElement(By.id("passwd")).sendKeys("adapa");
        chrome.findElement(By.id("SubmitLogin")).click();
        chrome.findElement(By.linkText("Women")).click();
        chrome.findElement(By.linkText("Tops")).click();
        chrome.findElement(By.id("layered_id_feature_5")).click();
        chrome.findElement(By.id("layered_quantity_1")).click();
        chrome.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
        chrome.findElement(By.id("quantity_wanted")).sendKeys("2");
        chrome.findElement(By.id("group_1")).sendKeys("M");
        chrome.findElement(By.id("color_14")).click();
        chrome.findElement(By.id("add_to_cart")).click();
        chrome.quit();

    }

    @Test
    public void TestBug1() {
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://automationpractice.com/");
        chrome.findElement(By.linkText("Sign in")).click();
        chrome.findElement(By.id("email")).sendKeys("ghij@gmail.com");
        chrome.findElement(By.id("passwd")).sendKeys("adapa");
        chrome.findElement(By.id("SubmitLogin")).click();
        chrome.findElement(By.linkText("Women")).click();
        chrome.findElement(By.id("layered_price_slider"));
        chrome.findElement(By.cssSelector("div[id='layered_price_slider']>a"));
        Actions sliderAction = new Actions(chrome);
        sliderAction.clickAndHold();
        sliderAction.moveByOffset(40, 0).build().perform();
        chrome.quit();
    }




}