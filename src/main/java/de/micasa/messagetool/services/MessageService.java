package de.micasa.messagetool.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.repository.IRepository;

@Service
class MessageService implements IService<Message> {
	private IRepository<Message> repository;

	public MessageService() {
	}

	@Override
	public List<Message> supplyAll() {
		// TODO Auto-generated method stub
		return repository.all();
	}

	@Override
	public Message supply(int i) {
		Message result = null;
		try {
			result = repository.all().get(i);
		} catch (RuntimeException e) {
			System.out.println(e);
		}
		return result;
	}

	@Autowired
	public void setRepository(IRepository<Message> repository) {
		if (repository != null) {
			this.repository = repository;
		} else {
			throw new IllegalArgumentException(IRepository.class + " is missing.");
		}
	}

}
