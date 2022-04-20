package de.micasa.messagetool.testmessage;

import org.springframework.stereotype.Service;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageProvider;
import de.micasa.messagetool.services.IMessageRender;

@Service("test")
final class TestMessageRender implements IMessageRender<Message> {

	private IMessageProvider<Message> provider;

	public TestMessageRender(IMessageProvider<Message> provider) {
		if (provider != null) {
			this.provider = provider;
		} else {
			throw new IllegalArgumentException("provider is null");
		}
	}

	public void render() {
		System.out.println(provider.getMessage().getSubject());

	}

}
