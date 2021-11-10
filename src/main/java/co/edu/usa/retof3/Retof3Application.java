package co.edu.usa.retof3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages = {"co.edu.usa.retof3"})
public class Retof3Application {

    public static void main(String[] args) {
		SpringApplication.run(Retof3Application.class, args);
	}

}
