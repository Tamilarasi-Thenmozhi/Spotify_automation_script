package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Spotify {

    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "/home/tamilarasi/Public/Selenium/chromedriver-linux64/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));          // WebDriverWait for explicit waits


        try {
            driver.manage().window().maximize();

            // Navigate to login page
            driver.get("https://accounts.spotify.com/en/login/");

            // Enter username and password
            driver.findElement(By.id("login-username")).sendKeys("tamilarasim916@gmail.com");
            driver.findElement(By.id("login-password")).sendKeys("Testadmin@123!");

            // Click login button
            driver.findElement(By.id("login-button")).click();

            // Handle age consent dialog
            WebElement ageConsentButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[2]/div/div/button[2]")));
            ageConsentButton.click();

            // Search for a song
            WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/nav/div[1]/ul/li[2]/a")));
            searchField.click();
            WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[3]/div/div/form/input")));
            searchBar.sendKeys("vikram" + Keys.ENTER);

            // Play a song
            WebElement playButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchPage\"]/div/div/section[2]/div[2]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/button")));
            playButton.click();

            // Pause the song
            WebElement pauseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/footer/div[1]/div[2]/div/div[1]/button")));
            pauseButton.click();

            // Search for a podcast
            searchBar.clear();
            searchBar.sendKeys("naallanaa murukku" + Keys.ENTER);
            WebElement podcastResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='searchPage']/div/div/section[1]/div[2]/div/div/div/div[3]")));
            podcastResult.click();

            // Play the podcast
            WebElement playPodcastButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div/div[2]/main/section/div[4]/div[2]/div[2]/div/div[4]/div/div[7]/div/button/div")));
            playPodcastButton.click();

            // Pause the podcast
            pauseButton.click();

            // Logout
            WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[2]/div[1]/header/button")));
            logoutButton.click();
            WebElement logoutConfirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='context-menu']/div/ul/li[4]/button")));
            logoutConfirmButton.click();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

