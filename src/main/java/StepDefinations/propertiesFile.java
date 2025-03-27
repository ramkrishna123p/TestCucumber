package StepDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

public class propertiesFile {
	 private static Properties prop;
	 private String propertiesPath=null;
	 public FileInputStream fis;
	 propertiesFile(){
	        prop = new Properties();
	        if(propertiesPath==null){
	        	propertiesPath="src/test/resource/config.properties";
	        }
	       
			try {
				fis = new FileInputStream(new File(propertiesPath));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	         
	       
	        try {
	            prop.load(fis);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	 
	 
	     public String getValue(String key){
	        return prop.getProperty(key);   
	    }
	    
	    public Properties getProperties(){
	        return prop;   
	    }
	    
	   
}
