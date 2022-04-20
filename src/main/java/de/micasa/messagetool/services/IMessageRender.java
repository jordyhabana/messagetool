package de.micasa.messagetool.services;

public abstract interface IMessageRender<E>{

	public abstract void render(IMessageProvider<E> provider);
	
}
