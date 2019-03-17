package cl.getcolors.loggerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class LoggerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggerServiceApplication.class, args);
	}

}
