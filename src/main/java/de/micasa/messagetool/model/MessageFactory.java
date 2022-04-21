package de.micasa.messagetool.model;

import org.springframework.stereotype.Component;

@Component
public class MessageFactory {

	public MessageFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Message getSimpleMessage(String subject) {
		return new SimpleMessage(subject);
	}
	
	public Message getTestMessage(String subject) {
		return new TestMessage(subject);
	}

}
