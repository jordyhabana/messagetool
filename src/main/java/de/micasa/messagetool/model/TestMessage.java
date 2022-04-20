package de.micasa.messagetool.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
final class TestMessage extends Message {

    public TestMessage(@Value("good morning") String subject) {
		super(subject);
	}

}
