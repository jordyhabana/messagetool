package de.micasa.messagetool.testmessage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageProvider;
import de.micasa.messagetool.services.IMessageRender;

@Configuration
public class TestMessageConfiguration {

	@Bean
	public IMessageProvider<Message> getMessageProvider() {
		return new TestMessageProvider();
	}

	@Bean
	public IMessageRender<Message> getIMessageRender() {
		return new TestMessageRender(getMessageProvider());

	}

}
