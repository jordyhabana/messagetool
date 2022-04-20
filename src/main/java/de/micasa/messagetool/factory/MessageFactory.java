package de.micasa.messagetool.factory;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageProvider;
import de.micasa.messagetool.services.IMessageRender;

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
