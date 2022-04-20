package de.micasa.messagetool.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = { "de.micasa.messagetool.testmessage","de.micasa.messagetool.model" })
@Configuration
public class TestMessageConfiguration {
}
