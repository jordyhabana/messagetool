package com.project.demo.model;

public abstract class Message {
	private final String subject;

	Message(String subject) {
		if (subject != null) {
			this.subject = subject;
		} else {
			throw new IllegalArgumentException("the subject is not allowed to be null");
		}
	}

	public String getSubject() {
		return subject;
	}

}
