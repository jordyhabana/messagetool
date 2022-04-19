package com.project.demo.services;

public abstract interface IMessageRender<E>{

	public abstract void render(IMessageProvider<E> provider);
	
}
