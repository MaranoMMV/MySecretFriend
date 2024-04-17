package com.myfriendsecret.myfriendsecret.service.email;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements CommandLineRunner {

	 private final EnviaEmailService enviaEmailService;

	    public EmailService(EnviaEmailService enviaEmailService) {
	        this.enviaEmailService = enviaEmailService;
	    }

		@Override
		public void run(String... args) throws Exception {
		}
		
}
