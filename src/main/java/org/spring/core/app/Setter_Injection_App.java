package org.spring.core.app;

import java.util.logging.Logger;

import org.spring.core.beans.Coach;
import org.spring.core.beans.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setter_Injection_App {

	final static Logger logger = Logger.getLogger(Setter_Injection_App.class.getName());

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = applicationContext.getBean("tennisCoach", Coach.class);

		// getFortune from FortuneService
		// which injected in the Coach bean (Setter injection)
		logger.info(coach.getFortune());

		// clean up spring applicationContext
		applicationContext.close();

	}

}
