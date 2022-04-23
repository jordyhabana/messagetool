package de.micasa.messagetool.constants;

public enum License {

	GNU("Lisence GNU"), GPL("Lisence GPL");

	private String description;

	private License(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
