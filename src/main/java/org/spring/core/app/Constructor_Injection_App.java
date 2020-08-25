package org.spring.core.app;

import java.util.logging.Logger;

import org.spring.core.beans.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Constructor_Injection_App {

	final static Logger logger = Logger.getLogger(Constructor_Injection_App.class.getName());

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Coach coach = applicationContext.getBean("myCoach", Coach.class);

		// getFortune from FortuneService
		// which injected in the Coach bean (constructor injection)
		logger.info(coach.getFortune());

		// clean up spring context
		applicationContext.close();

	}

}
