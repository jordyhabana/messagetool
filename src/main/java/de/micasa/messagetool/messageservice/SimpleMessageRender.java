package de.micasa.messagetool.messageservice;

import org.springframework.stereotype.Service;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageProvider;
import de.micasa.messagetool.services.IMessageRender;

@Service("simple-render")
class SimpleMessageRender implements IMessageRender<Message> {

	private IMessageProvider<Message> provider;

	public SimpleMessageRender(IMessageProvider<Message> provider) {
		if (provider != null) {
			this.provider = provider;
		} else {
			throw new IllegalArgumentException("provider is null");
		}
	}

	public void render() {
		System.out.println("render: " + this.getClass().getName());
		System.out.println(provider.getMessage().getSubject());

	}

}
