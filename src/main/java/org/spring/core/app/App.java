package org.spring.core.app;

import java.util.logging.Logger;

import org.spring.core.beans.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	final static Logger logger = Logger.getLogger(App.class.getName());
	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		Coach coach = applicationContext.getBean("myCoach", Coach.class);
		
		logger.info(coach.getDailyWork());
		
		// inject fortuneServcie to getFortune (constructor injection)
		logger.info(coach.getFortune());
	}

}
