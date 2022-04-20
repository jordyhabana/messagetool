package de.micasa.messagetool.testmessage;

import org.springframework.stereotype.Service;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageProvider;

@Service
final class TestMessageProvider implements IMessageProvider<Message> {
	private final Message message;

	TestMessageProvider(Message message) {
		this.message = message;
	}

	public Message getMessage() {
		return message;
	}

}
