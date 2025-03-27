package StepDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;




public enum PropertiesUtil {
	PROP;
	   
    private Properties prop;
    PropertiesUtil(){
    	  prop = new Properties();
	        String propertiesPath=null;
			if(propertiesPath==null){
	        	propertiesPath="src/test/resource/config.properties";
	        }
	       
			FileInputStream fis = null;
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
    public static void main(String[] s){
        String val = PropertiesUtil.PROP.getValue("browser");
        System.out.println(val);
    }

    
    }
