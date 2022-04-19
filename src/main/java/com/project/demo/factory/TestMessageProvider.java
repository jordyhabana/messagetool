package com.project.demo.factory;

import com.project.demo.model.Message;
import com.project.demo.model.SimpleMessage;
import com.project.demo.services.IMessageProvider;

final class TestMessageProvider implements IMessageProvider<Message> {

	public Message getMessage() {
		return new SimpleMessage("Hi there");
	}

}
