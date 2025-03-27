package StepDefinations;



import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before(order=0)
		public void setup(){
			System.out.println("lets get started");
			System.out.println("lanuch browser");
		}
		
	@After(order=0)
	public void teardown(){
		System.out.println("close browser");
		genericdefinations.closeBrowser();
	}
	/*
	@After(order=1)
	public void aferScenario(Scenario scenario){
		
	}*/
	
}
