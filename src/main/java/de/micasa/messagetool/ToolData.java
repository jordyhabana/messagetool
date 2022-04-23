package de.micasa.messagetool;

import de.micasa.messagetool.constants.License;

public final class ToolData {
	private final String name;
	private final String version;
	private final int year;
	private final License license;

	public ToolData(String name, String version, int year, License license) {
		super();
		this.name = name;
		this.version = version;
		this.year = year;
		this.license = license;
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public int getYear() {
		return year;
	}

	public License getLicense() {
		return license;
	}

}
