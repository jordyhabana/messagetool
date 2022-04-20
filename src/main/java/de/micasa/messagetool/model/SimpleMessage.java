package de.micasa.messagetool.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("simple")
final class SimpleMessage extends Message {

    public SimpleMessage(@Value("this is a simple message") String subject) {
		super(subject);
	}

}
