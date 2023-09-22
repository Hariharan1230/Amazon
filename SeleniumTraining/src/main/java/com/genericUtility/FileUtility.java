package com.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
				public String readCommondata(String key) throws IOException
				{
			FileInputStream fis = new FileInputStream("./src/test/resources/cd1.properties");
			Properties p = new Properties () ;
			p.load (fis);
			String value = p.getProperty(key); 
			return value;
}}
