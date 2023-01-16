package library.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTestWithoutConfig {

    @Test
    public void testGithubTitle(){
        // Настройка Хром драйвера
        WebDriverManager.chromedriver().setup();

        // конфигурация запуска: браузер = хром, урл = гитхаб
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");

        // выполнение теста
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Let’s build from here · GitHub");
        driver.quit();
    }

}
