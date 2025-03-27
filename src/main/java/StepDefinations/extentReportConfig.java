package StepDefinations;

import java.text.SimpleDateFormat;
import java.util.Date;

public class extentReportConfig {
	public static String dateTimeStamp=null;
	
	public static final String extentbasepath="src/test/resources/output/extentreport/extentreport";
	protected static void DataTimeStamp(){
		SimpleDateFormat sdft=new SimpleDateFormat("yyyyMMddHHmmss");
		Date now=new Date();
		dateTimeStamp = sdft.format(now);
	}
	
	protected static void createDirectory(){
		DataTimeStamp();
	}
}
