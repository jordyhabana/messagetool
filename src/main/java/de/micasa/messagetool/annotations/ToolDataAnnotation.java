package de.micasa.messagetool.annotations;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

import de.micasa.messagetool.constants.License;

@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
@Qualifier
public @interface ToolDataAnnotation {

	String type();

	License license();

}
