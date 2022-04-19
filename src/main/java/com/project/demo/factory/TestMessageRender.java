package com.project.demo.factory;

import com.project.demo.model.Message;
import com.project.demo.services.IMessageProvider;
import com.project.demo.services.IMessageRender;

class TestMessageRender implements IMessageRender<Message> {

	public void render(IMessageProvider<Message> provider) {
		if (provider != null) {
			System.out.println(provider.getMessage().getSubject());
		} else {
			throw new IllegalArgumentException("provider is null");
		}

	}

}
