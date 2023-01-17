package library.owner;

import library.owner.config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthTest {

    @Test
    public void testClasspath(){
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("darya");
        assertThat(config.password()).isEqualTo("123123");
    }
    // сначала создаем проперти с нужными данными, затем конфиг с сылками на эти данные,
    // и уже в тесте используем ссылки из конфига

    @Test
    public void testLocalFile() throws IOException {
        // эти данные
        String content = "username=secret-user\npassword=secret-pass";
        // мы записывам в этот файл
        Path propsPath = Paths.get("/tmp/secret.properties");
        Files.write(propsPath, content.getBytes(StandardCharsets.UTF_8));
        // создается конфиг
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("secret-user");
        assertThat(config.password()).isEqualTo("secret-pass");
        Files.delete(propsPath);
    }
}

