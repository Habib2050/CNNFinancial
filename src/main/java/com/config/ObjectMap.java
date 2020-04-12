package com.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectMap {

	
	public 	String getconfig (String object) throws IOException {
		
		String file= "./config.properties"; //This is path from my file 
		FileInputStream fis= new FileInputStream(file);////Serilization
		
		Properties properties= new Properties(); //Java properties class to read notepad data 
	    properties.load(fis); // connection btw properties & Serilization
	    properties.getProperty(object); // first get the property  then passing data with parameter
	    
	    return properties.getProperty(object);
	    
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


