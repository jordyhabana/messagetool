package com.project.demo;

import com.project.demo.factory.MessageFactory;
import com.project.demo.model.Message;
import com.project.demo.services.IMessageProvider;
import com.project.demo.services.IMessageRender;

public class DemoApplication {

	public static void main(String[] args) {
		IMessageProvider<Message> messageProvider = MessageFactory.getInstance().getIMessageProvider();
		IMessageRender<Message> messageRender = MessageFactory.getInstance().getIMessageRender();

		messageRender.render(messageProvider);

	}

}
