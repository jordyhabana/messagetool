package com.project.demo.factory;

import com.project.demo.services.IMessageProvider;
import com.project.demo.services.IMessageRender;

public class MessageFactory {
	private final static MessageFactory messageFactory;
	private IMessageProvider<String> provider = new TestMessageProvider();
	private IMessageRender<String> render = new TestMessageRender();
	
	static {
		messageFactory = new MessageFactory();
	}
	
	private MessageFactory() {}
	
	public static MessageFactory getInstance() {
		return messageFactory;
	}
	
	public IMessageProvider<String> getIMessageProvider(){
		return provider;
	}
	
	public IMessageRender<String> getIMessageRender(){
		return render;
	}
	

}
