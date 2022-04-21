package de.micasa.messagetool.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.model.MessageFactory;

@Repository
class MessageRepository implements IRepository<Message> {

	private MessageFactory messageFactory;

	public MessageRepository() {
	}

	@Override
	public List<Message> all() {
		// TODO Auto-generated method stub
		List<Message> messages = new ArrayList<>();
		messages.add(messageFactory.getSimpleMessage("Simple message 1"));
		messages.add(messageFactory.getSimpleMessage("Simple message 2"));
		messages.add(messageFactory.getTestMessage("Test message 1"));
		return messages;
	}

	@Autowired
	public void setMessaFactory(MessageFactory messageFactory) {
		if (messageFactory != null) {
			this.messageFactory = messageFactory;
		} else {
			throw new IllegalArgumentException(MessageFactory.class + "missing");
		}

	}

}
