package de.micasa.messagetool.testmessage;

import org.springframework.stereotype.Service;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageProvider;
import de.micasa.messagetool.services.IMessageRender;

@Service("mytest")
final class MyTestMessageRender implements IMessageRender<Message> {

	private IMessageProvider<Message> provider;

	public MyTestMessageRender(IMessageProvider<Message> provider) {
		if (provider != null) {
			this.provider = provider;
		} else {
			throw new IllegalArgumentException("provider is null");
		}
	}

	public void render() {
		System.out.println("My test message is:");
		System.out.println(provider.getMessage().getSubject());

	}

}
