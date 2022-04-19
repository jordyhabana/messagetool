package com.project.demo.services;

public abstract interface IMessageRender<E>{

	public abstract void setProvider(IMessageProvider<E> provider);
	
	public abstract void render();
	
}
