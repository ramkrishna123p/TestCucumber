package StepDefinations;

public class amazonPageConstants {
 
	public static final String SIGNINLINK="//div[@id='nav-tools']/descendant::div[2]/span";
	public static final String USERNAME="//input[@name='email']";
	public static final String CONTINUE="//div[@id='authportal-center-section']/descendant::span[@id='continue']//input";
	public static final String PASSWORD="//input[@type='password']";
	public static final String SIGNIN="//input[@type='submit']";
	public static final String LOGGEDINUSERTEXT="//span[contains(text(),'Hello, Venkat')]";
	public static final String SIGNOUT="//a[@id='nav-item-signout']/span";
	public static final String LANDINGPAGE="//h1[contains(text(),'Sign in')]";
	public static final long QA_TIMEOUT=8000;
}
