package Demospring;

public class CricketCoach implements Coach {
	private String email;
	private String team;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	

	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Fast bowling practice every day ";
	}

	/*
	 * public CricketCoach(FortuneService fortuneService) { this.fortuneService =
	 * fortuneService; }
	 */

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public int add() {
		// TODO Auto-generated method stub
		return 4;
	}

}
