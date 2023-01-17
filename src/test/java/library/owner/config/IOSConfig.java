package library.owner.config;

import org.aeonbits.owner.Config;

// с помощью этой строки у нас работает с разными платформами и зачитывает данные из файла iphone12.properties
@Config.Sources({
        "classpath:iphone12.properties"
})
public interface IOSConfig extends Config {

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

    @Key("device.name")
    String deviceName();
}
