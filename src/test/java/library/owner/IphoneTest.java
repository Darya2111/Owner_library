package library.owner;

import library.owner.config.AndroidConfig;
import library.owner.config.IOSConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IphoneTest {
        // проверяем, что данные зачитываются из файла iphone12.properties
        @Test
        public void testPropertiesFile2(){
            IOSConfig config = ConfigFactory.create(IOSConfig.class, System.getProperties());
            assertThat(config.platformName()).isEqualTo("IOS");
            assertThat(config.platformVersion()).isEqualTo("14.0");
            assertThat(config.deviceName()).isEqualTo("iPhone 12 Pro Ultra High");
        }
}
// когда надо тестировать на разных девайсах или платформах, то добавляем еще проперти и конфиги