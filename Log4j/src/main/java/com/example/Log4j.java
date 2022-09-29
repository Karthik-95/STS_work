package com.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Log4j {
	static Logger log=Logger.getLogger(Log4j.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Karthik");
		log.warn("Hi");
		log.error("Hello");
		log.fatal("Good");
		log.debug("Morning");
		
	}

}
