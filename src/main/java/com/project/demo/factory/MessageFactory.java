package com.project.demo.factory;

import com.project.demo.model.Message;
import com.project.demo.services.IMessageProvider;
import com.project.demo.services.IMessageRender;

public class MessageFactory {
	private final static MessageFactory messageFactory;
	private IMessageProvider<Message> provider = new TestMessageProvider();
	private IMessageRender<Message> render = new TestMessageRender();
	
	static {
		messageFactory = new MessageFactory();
	}
	
	private MessageFactory() {}
	
	public static MessageFactory getInstance() {
		return messageFactory;
	}
	
	public IMessageProvider<Message> getIMessageProvider(){
		return provider;
	}
	
	public IMessageRender<Message> getIMessageRender(){
		return render;
	}
	

}
