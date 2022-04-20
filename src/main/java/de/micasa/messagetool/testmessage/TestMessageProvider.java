package de.micasa.messagetool.testmessage;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.model.SimpleMessage;
import de.micasa.messagetool.services.IMessageProvider;

final class TestMessageProvider implements IMessageProvider<Message> {

	public Message getMessage() {
		return new SimpleMessage("Hi there");
	}

}
