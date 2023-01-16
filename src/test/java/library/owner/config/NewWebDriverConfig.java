package library.owner.config;

import org.aeonbits.owner.Config;
import java.net.URL;

public interface NewWebDriverConfig extends Config {
    // конфигурация с использованием библиотеки owner

    //зачитываем данные из командной строки
    @Key("baseUrl")
    // обрабатываем дефолтное значение
    @DefaultValue("https://github.com")
    // конвертируем в возвращаемый тип
    String getBaseUrl();

    @DefaultValue("CHROME")
    @Key("browser")
    Browser getBrowser();

    @DefaultValue("https://localhost:4444/wd/hub")
    @Key("remoteUrl")
    URL getRemoteUrl();
}
