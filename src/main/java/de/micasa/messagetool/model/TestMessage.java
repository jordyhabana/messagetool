package de.micasa.messagetool.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("test")
final class TestMessage extends Message {

    public TestMessage(@Value("this is a test message") String subject) {
		super(subject);
	}

}
