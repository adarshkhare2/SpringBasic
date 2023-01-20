package Demospring;

public class Trackcoach implements Coach {
	private FortuneService fortuneService;
	//We created no argument constructor so it will not  give error in MyApp.java
	public Trackcoach() {
		
	}
	
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}
	public Trackcoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public int add() {
		return 2;
	}
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it "+fortuneService.getFortune();
	}
	
	public void doMyCreateBean() {
		System.out.println("This method call when bean get Create.");
	}
	public void doMyDistroyBean() {
		System.out.println("This method call when bean get Destroy");
	}

}
