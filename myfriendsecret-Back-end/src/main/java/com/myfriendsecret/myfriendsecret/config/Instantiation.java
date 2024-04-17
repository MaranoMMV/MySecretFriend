package com.myfriendsecret.myfriendsecret.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.myfriendsecret.myfriendsecret.repository.ParticipanteRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	private ParticipanteRepository participanteRepository;
	
	public Instantiation(ParticipanteRepository participanteRepository) {
		this.participanteRepository = participanteRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		participanteRepository.deleteAll();
	}

}
