package com.project.demo;

import com.project.demo.factory.MessageFactory;
import com.project.demo.services.IMessageProvider;
import com.project.demo.services.IMessageRender;

public class DemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IMessageProvider<String> messageProvider = MessageFactory.getInstance().getIMessageProvider();
	    IMessageRender<String> messageRender = MessageFactory.getInstance().getIMessageRender();
	    
	    messageRender.setProvider(messageProvider);
	    messageRender.render();
	}

}
