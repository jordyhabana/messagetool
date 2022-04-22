package de.micasa.messagetool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessagetoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagetoolApplication.class, args);

	}

	@Bean
	@TypeMessage(format = Format.SMS, type = "test")
	public String sms() {
		return "Im an SMS test";
	}

	@Bean
	@TypeMessage(format = Format.EMAIL, type = "test")
	public String email() {
		return "Im an EMAIL test";
	}

}
