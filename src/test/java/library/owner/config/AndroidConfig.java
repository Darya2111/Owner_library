package library.owner.config;

import org.aeonbits.owner.Config;

// с помощью этой строки у нас работает с разными платформами и зачитывает данные из файла android.properties
@Config.Sources({
        "classpath:android.properties"
})
public interface AndroidConfig extends Config {

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

    @Key("device.name")
    String deviceName();
}
