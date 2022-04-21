package de.micasa.messagetool.repository;

import java.util.List;

public abstract interface IRepository<E> {

	public abstract List<E> all();

}
