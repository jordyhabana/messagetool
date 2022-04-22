package de.micasa.messagetool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.micasa.messagetool.ToolData;

@RestController
@RequestMapping("/tool")
class ToolDataController {

	@Autowired
	private ToolData toolData;

	@GetMapping("/about")
	public ToolData getToolData() {
		return toolData;
	}

}
