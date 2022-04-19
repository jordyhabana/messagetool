package com.project.demo.factory;

import com.project.demo.services.IMessageProvider;
import com.project.demo.services.IMessageRender;

class TestMessageRender implements IMessageRender<String> {
	private IMessageProvider<String> provider;

	public void setProvider(IMessageProvider<String> provider) {
		// TODO Auto-generated method stub
		this.provider = provider;

	}

	public void render() {
		// TODO Auto-generated method stub
        System.out.println(provider.getMessage());
	}

}
