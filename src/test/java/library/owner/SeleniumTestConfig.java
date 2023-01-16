package library.owner;

import library.owner.config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTestConfig {

    // вставляем нашу конфигурацию
    private WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testGithubTitle2(){
        // выполнение теста
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Let’s build from here · GitHub");
    }

    @AfterEach
    public void stopDriver(){
        driver.quit();
    }
}
