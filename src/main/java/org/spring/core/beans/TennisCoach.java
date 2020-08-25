package org.spring.core.beans;

import org.spring.core.services.FortuneService;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	// need setter to inject the fortuneService
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	public String getDailyWork() {
		return null;
	}

}
