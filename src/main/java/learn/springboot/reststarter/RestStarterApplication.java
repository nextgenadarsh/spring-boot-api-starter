package learn.springboot.reststarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestStarterApplication.class, args);

		System.out.println("Welcome to spring boot !!");
	}

}
