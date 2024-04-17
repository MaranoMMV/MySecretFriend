package com.myfriendsecret.myfriendsecret.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myfriendsecret.myfriendsecret.entity.Participante;
import com.myfriendsecret.myfriendsecret.service.ParticipanteService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/participantes")
public class ParticipanteController {

	private ParticipanteService participanteService;

	public ParticipanteController(ParticipanteService participanteService) {
		this.participanteService = participanteService;
	}
	
	@PostMapping
	public Participante postParticipante(@RequestBody Participante parcicipante){
		return participanteService.salvarParticipante(parcicipante);
	}
	
	@GetMapping
	public List<Participante> getTodosOsParticipantes(){
		return participanteService.todosOsParticipantes();
	}
	
	@GetMapping("/sortear")
	public List<Participante> sortearAmigoSecreto(){
		return participanteService.sortearAmigoSecreto();
	}
	
	
	
}
