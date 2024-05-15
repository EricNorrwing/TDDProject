package se.reky.hakan.controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@Disabled
public class PlayerControllerTest {

    private WebDriver driver;

    @BeforeAll
    public static void setUpBeforeAllTests(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    @DisplayName("Testing whether the amount of players in list is correct")
    public void testAmountOfPlayers() {
        driver.get("http://localhost:8080/players");
        List<WebElement> playerItems = driver.findElements(By.tagName("li"));

        Assertions.assertEquals(3, playerItems.size(), "unable to assert the amount of players");
    }

    @Test
    @DisplayName("Testing whether the first name of the highscorelist is visible")
    public void testPlayerListPageFirstPlayerNameDisplayed() {
        driver.get("http://localhost:8080/players");
        WebElement firstPlayerNameElement = driver.findElement(By.xpath("//li[1]//span[@class='player-name']"));

        Assertions.assertTrue(firstPlayerNameElement.isDisplayed(), "unable to to verify the first element in list");
    }


}