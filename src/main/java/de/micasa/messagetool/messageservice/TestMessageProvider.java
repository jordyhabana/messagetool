package de.micasa.messagetool.messageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageProvider;

@Service
class TestMessageProvider implements IMessageProvider<Message> {	
	
	private Message message;	

	public Message getMessage() {
		return message;
	}
	
	@Autowired
	@Qualifier("simple")
	public void setMessage(Message message) {
		if(message != null) {
			this.message = message;
		} else {
			throw new IllegalArgumentException("Message not allowed to be null");
		}
	}

}
