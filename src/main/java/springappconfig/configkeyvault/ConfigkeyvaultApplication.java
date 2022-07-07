package springappconfig.configkeyvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class ConfigkeyvaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigkeyvaultApplication.class, args);
	}

}
