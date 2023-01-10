package Demospring;

public class Baseballcoach implements Coach {
	//private field
	private FortuneService fortuneService;
	//Constructor
	public Baseballcoach(FortuneService thefortuneService)
	{
		//thefortuneService is taking value from user and giving the value to fortuneService
		fortuneService=thefortuneService;
	}
	public String getDailyWorkout() {
		return "Spend 30 min for batting practish";
	}
	public int add() {
		return 1;
	}
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
