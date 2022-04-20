package de.micasa.messagetool.factory;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IMessageProvider;
import de.micasa.messagetool.services.IMessageRender;

class TestMessageRender implements IMessageRender<Message> {

	public void render(IMessageProvider<Message> provider) {
		if (provider != null) {
			System.out.println(provider.getMessage().getSubject());
		} else {
			throw new IllegalArgumentException("provider is null");
		}

	}

}
