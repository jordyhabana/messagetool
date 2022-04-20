package de.micasa.messagetool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import de.micasa.messagetool.configuration.TestMessageConfiguration;
import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageRender;

//@SpringBootApplication
public class MessagetoolApplication {

	@SuppressWarnings({ "resource", "unchecked" })
	public static void main(String[] args) {
		//SpringApplication.run(MessagetoolApplication.class, args);

		ApplicationContext app = new AnnotationConfigApplicationContext(TestMessageConfiguration.class);
		IMessageRender<Message> render = app.getBean("test",IMessageRender.class);
		render.render();
	}

}
