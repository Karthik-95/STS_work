package com.example.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailSenderApplication {
	
	@Autowired
	EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendMail("kk95mech@gmail.com", "Mail From SpringBoot App", "Hi,  This mail is send from Spring boot application created by the developer 'Karthik' " );
	}

}
