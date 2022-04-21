package de.micasa.messagetool.services;

import java.util.List;

public abstract interface IService<E> {

	public abstract List<E> supplyAll();

	public abstract E supply(int i);

}
