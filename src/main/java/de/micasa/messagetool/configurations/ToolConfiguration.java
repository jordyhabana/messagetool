package de.micasa.messagetool.configurations;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import de.micasa.messagetool.ToolData;
import de.micasa.messagetool.annotations.ToolDataAnnotation;
import de.micasa.messagetool.constants.License;

@Configuration
@PropertySource("classpath:application.properties")
public class ToolConfiguration {

	@Bean
	@ToolDataAnnotation(license = License.GNU, type = "beta")
	public ToolData getToolDataOldVersionBeta(@Value("${tool.name}") String name) {
		return new ToolData(name, "BETA-X1", LocalDate.now().getYear(), License.GNU);
	}

	@Bean
	@ToolDataAnnotation(license = License.GNU, type = "pro")
	public ToolData getToolDataOldVersionPro(@Value("${tool.name}") String name) {
		return new ToolData(name, "PRO-X1", LocalDate.now().getYear(), License.GNU);
	}

	@Bean
	@ToolDataAnnotation(license = License.GPL, type = "beta")
	public ToolData getToolDataCurrentVersionBeta(@Value("${tool.name}") String name,
			@Value("${tool.version}") String version) {
		return new ToolData(name, version, LocalDate.now().getYear(), License.GPL);
	}

}
