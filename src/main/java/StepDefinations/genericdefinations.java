package StepDefinations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import StepDefinations.LocatorType;


import io.github.bonigarcia.wdm.WebDriverManager;

public class genericdefinations {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public propertiesFile propFile;
	public genericdefinations(){
		propFile=new propertiesFile();
	}
 public static void Intilization(){
	 
	 String test=PropertiesUtil.PROP.getValue("browser");
	 System.out.println(test);
	  if(PropertiesUtil.PROP.getValue("browser").equalsIgnoreCase("Chrome")){
    	 WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
     }else if(PropertiesUtil.PROP.getValue("browser").equalsIgnoreCase("Firefox")){
    	 WebDriverManager.firefoxdriver().setup();
    	 driver=new FirefoxDriver();
     }else if(PropertiesUtil.PROP.getValue("browser").equalsIgnoreCase("ie")){
    	 WebDriverManager.iedriver();
     }else{
    	 WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver(); 
     }
 }
public static void setup(){
     driver.get(PropertiesUtil.PROP.getValue("URL"));
 
 }
	
public static WebElement getWebElemnt(LocatorType t,String locatorValue,long time){
	WebElement element = null;
	 	 switch(t){
     	 case ID: element =  (new WebDriverWait(driver, Duration.ofSeconds(time)))
               .until(ExpectedConditions.presenceOfElementLocated(By.id(locatorValue)));
     	        break;
     	 case CLASSNAME:
     		 element =  (new WebDriverWait(driver, Duration.ofSeconds(time)))
           .until(ExpectedConditions.presenceOfElementLocated(By.className(locatorValue)));  
     		 break;
     		 
     	case XPATH:
     	 element =  (new WebDriverWait(driver, Duration.ofSeconds(time)))
       .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locatorValue)));

    		 break;	 
     	case CSSSELECTOR:
     	    element =  (new WebDriverWait(driver,Duration.ofSeconds(time)))
          .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locatorValue)));

    		 break;
    		 
     	case NAME:
     	    element =  (new WebDriverWait(driver, Duration.ofSeconds(time)))
          .until(ExpectedConditions.presenceOfElementLocated(By.name(locatorValue)));

    		 break;
    		 
     	case TAGNAME:
     	    element =  (new WebDriverWait(driver,Duration.ofSeconds(time)))
          .until(ExpectedConditions.presenceOfElementLocated(By.tagName(locatorValue)));

    		 break;
    	
     	case LINKTEXT:
     	    element =  (new WebDriverWait(driver, Duration.ofSeconds(time)))
          .until(ExpectedConditions.presenceOfElementLocated(By.linkText(locatorValue)));

    		 break;
    	
     	case PARTIALLINKTEXT:
     	    element =  (new WebDriverWait(driver, Duration.ofSeconds(time)))
          .until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(locatorValue)));

    		 break;
     	default :
     	    element =  (new WebDriverWait(driver, Duration.ofSeconds(time)))
          .until(ExpectedConditions.presenceOfElementLocated(By.id(locatorValue)));

    		 break; 	
     	 }

     	return element;
     }

public static WebElement getele(LocatorType t,String locatorValue){
	WebElement element = null;
	 	 switch(t){
     	 case ID: element =  driver.findElement(By.id(locatorValue));
     	 case CLASSNAME:
     		 element = driver.findElement(By.className(locatorValue));
     		 
     	case XPATH:
     	 element =  driver.findElement(By.xpath(locatorValue));
    		 break;	 
     	case CSSSELECTOR:
     	    element = driver.findElement(By.cssSelector(locatorValue)); 
    		 break;
    		 
     	case NAME:
     	    element = driver.findElement(By.name(locatorValue)); 
    		 break;
    		 
     	case TAGNAME:
     	    element =  driver.findElement(By.tagName(locatorValue));
    		 break;
    	
     	case LINKTEXT:
     	    element =  driver.findElement(By.linkText(locatorValue));

    		 break;
    	
     	case PARTIALLINKTEXT:
     	    element =  driver.findElement(By.partialLinkText(locatorValue));

    		 break;
     	default :
     	     element =  driver.findElement(By.xpath(locatorValue));

    		 break; 	
     	 }

     	return element;
     }

public static List<WebElement> geteles(LocatorType t, String locatorValue){
 	 List<WebElement> element = null;
 	 
 	 switch(t){
 	 case ID: 
 		 element =  driver.findElements(By.id(locatorValue));
 		 break;
 	 case CLASSNAME:
 		 element =  driver.findElements(By.className(locatorValue));
 		 break;
 		 
 	case XPATH:
 	 element =  driver.findElements(By.xpath(locatorValue));
		 break;	 
 	case CSSSELECTOR:
 	    element = driver.findElements(By.cssSelector(locatorValue)); 
		 break;
		 
 	case NAME:
 	    element = driver.findElements(By.name(locatorValue));
		 break;
		 
 	case TAGNAME:
 	    element =  driver.findElements(By.tagName(locatorValue));
		 break;
	
 	case LINKTEXT:
 	    element =  driver.findElements(By.linkText(locatorValue));
		 break;
	
 	case PARTIALLINKTEXT:
 	    element =  driver.findElements(By.partialLinkText(locatorValue));
		 break;
 	    
 	default :
 	    element =  driver.findElements(By.xpath(locatorValue));
		 break; 	
 	 }

 	return element;
 }

public static void Click(LocatorType t,String locatorValue){
	getele(t,locatorValue).click();
}

public static void SendKeys(LocatorType t,String locatorValue,String value){
	getele(t,locatorValue).sendKeys(value);
}

public static void windowMaximize(){
	driver.manage().window().maximize();
}

public static void deleteAllCookies(){
	driver.manage().deleteAllCookies();
}

public static void waitTime(long sec){
	try {
		Thread.sleep(sec);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}

public static String getWebElementText(LocatorType t,String locatorValue){
	return getele(t,locatorValue).getText();	
}

public static void closeBrowser(){
	driver.quit();
}

public static void mouseOver(LocatorType t,String locatorValue){
	//Creating object of an Actions class
	Actions action = new Actions(driver);

	//Performing the mouse hover action on the target element.
	action.moveToElement(getele(t,locatorValue)).perform();
}


	
	
	
}
	
	

