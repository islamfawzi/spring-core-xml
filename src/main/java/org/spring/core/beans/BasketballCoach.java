package org.spring.core.beans;

import org.spring.core.services.FortuneService;

public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BasketballCoach() {
	}

	/** used for constructor injection **/
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWork() {
		return "Playing BasketBall!";
	}

	public String getFortune() {
		return fortuneService.getFortune();
	}

}
