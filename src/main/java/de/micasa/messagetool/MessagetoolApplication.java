package de.micasa.messagetool;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.micasa.messagetool.factory.MessageFactory;
import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageProvider;
import de.micasa.messagetool.services.IMessageRender;

@SpringBootApplication
public class MessagetoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagetoolApplication.class, args);
		
		IMessageProvider<Message> messageProvider = MessageFactory.getInstance().getIMessageProvider();
		IMessageRender<Message> messageRender = MessageFactory.getInstance().getIMessageRender();
        messageRender.render(messageProvider);
	}

}
