package org.spring.core.app;

import java.util.logging.Logger;

import org.spring.core.beans.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC_App {

	final static Logger logger = Logger.getLogger(IOC_App.class.getName());
	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// inject bean defined in applicationContext.xml file and created by the spring container
		Coach coach = applicationContext.getBean("myCoach", Coach.class);
		logger.info(coach.getDailyWork());
		
		// clean up spring context
		applicationContext.close();
	}

}
