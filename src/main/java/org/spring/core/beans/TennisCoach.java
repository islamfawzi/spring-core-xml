package org.spring.core.beans;

import org.spring.core.services.FortuneService;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	private String email;

	private int number;

	// used for setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// used for setter injection
	public void setEmail(String email) {
		this.email = email;
	}

	// used for setter injection
	public void setNumber(int number) {
		this.number = number;
	}

	public String getFortune() {
		return String.format("%s %s %d", fortuneService.getFortune(), email, number);
	}

	public String getDailyWork() {
		return null;
	}

}
