package com.project.demo.factory;

import com.project.demo.services.IMessageProvider;

class TestMessageProvider implements IMessageProvider<String> {

	public String getMessage() {
		return "Hello there";
	}	

}
