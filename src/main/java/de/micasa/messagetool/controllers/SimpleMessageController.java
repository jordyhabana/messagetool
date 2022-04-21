package de.micasa.messagetool.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.micasa.messagetool.context.MyApplicationContext;
import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IService;

@RestController
@RequestMapping("/messages")
class SimpleMessageController {

	private IService<Message> messageService;

	private MyApplicationContext myApplicationContext;

	public List<Message> listMessages() {
		return messageService.supplyAll();
	}

	@GetMapping("/bean")
	public boolean bean() {
		return myApplicationContext.containsBean("messageService");
	}

	@Autowired
	public void setMyApplicationContext(MyApplicationContext myApplicationContext) {
		if (myApplicationContext != null) {
			this.myApplicationContext = myApplicationContext;
		} else {
			throw new IllegalArgumentException(" is missing.");
		}
	}

}
