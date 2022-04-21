package de.micasa.messagetool.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationContext implements ApplicationContextAware {

	private ConfigurableApplicationContext ctx;

	public MyApplicationContext() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.ctx = (ConfigurableApplicationContext) applicationContext;
	}

	public boolean containsBean(String beanDefinition) {
		return ctx.containsBeanDefinition(beanDefinition);
	}

}
