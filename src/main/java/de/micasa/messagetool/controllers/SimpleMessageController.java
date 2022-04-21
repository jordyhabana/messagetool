package de.micasa.messagetool.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.micasa.messagetool.model.Message;
import de.micasa.messagetool.services.IService;

@RestController
@RequestMapping("/messages")
class SimpleMessageController {

	private IService<Message> messageService;

	@GetMapping
	public List<Message> listMessages() {
		return messageService.supplyAll();
	}

	@Autowired
	public void setMessageService(IService<Message> messageService) {
		if (messageService != null) {
			this.messageService = messageService;
		} else {
			throw new IllegalArgumentException(IService.class + " is missing.");
		}
	}

}
