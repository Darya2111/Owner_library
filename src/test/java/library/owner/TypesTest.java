package library.owner;

import library.owner.config.TypesConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// тесты на мои тесты. Тестируем инструменты

public class TypesTest {

    @Test
    public void testInteger(){
        System.setProperty("integer", "10");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getInteger()).isEqualTo(10);

    }

    @Test
    public void testDouble(){
        System.setProperty("double", "10.10");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());
        assertThat(config.getDouble()).isEqualTo(10.10);

    }
}
