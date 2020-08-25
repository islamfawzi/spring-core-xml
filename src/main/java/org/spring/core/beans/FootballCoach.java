package org.spring.core.beans;

import org.spring.core.services.FortuneService;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	public FootballCoach() {
	}
	
	/** used for constructor injection **/
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWork() {
		return "Playing Football!";
	}

	public String getFortune() {
		return fortuneService.getFortune();
	}

	
}
