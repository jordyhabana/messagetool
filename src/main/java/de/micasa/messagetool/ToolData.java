package de.micasa.messagetool;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public final class ToolData {
	private final String name;

	public ToolData(@Value("${tool.name}") String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
