package com.myfriendsecret.myfriendsecret.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myfriendsecret.myfriendsecret.entity.Participante;
import com.myfriendsecret.myfriendsecret.repository.ParticipanteRepository;
import com.myfriendsecret.myfriendsecret.service.email.EnviaEmailService;

@Service
public class ParticipanteService {

	private ParticipanteRepository participanteRepository;
	private final EnviaEmailService enviaEmailService;


	
	public ParticipanteService(ParticipanteRepository participanteRepository, EnviaEmailService enviaEmailService) {
		this.participanteRepository = participanteRepository;
		this.enviaEmailService = enviaEmailService;
	}


	public Participante salvarParticipante(Participante parcicipante){
		return participanteRepository.save(parcicipante);
	}
	
	
	public List<Participante> todosOsParticipantes(){
		List<Participante> listaParticipante = participanteRepository.findAll();
		return listaParticipante;
	}
	
	public List<Participante> sortearAmigoSecreto() {
		if(participanteRepository.count() <=1) {
			throw new RuntimeException("Para realizar o sorteio o numero de participantes deve ser 2 ou mais");
		}
	    List<Participante> participantes = participanteRepository.findAll();
	    List<Participante> amigosSorteados = new ArrayList<>();

	    Collections.shuffle(participantes); // Embaralha a lista

	    for (int i = 0; i < participantes.size(); i++) {
	        Participante atual = participantes.get(i);
	        Participante amigoSecreto;

	        // Encontra um amigo secreto diferente do atual
	        do {
	            int indiceAmigo = (i + 1) % participantes.size();
	            amigoSecreto = participantes.get(indiceAmigo);
	        } while (
	        		amigoSecreto.getId()
	        		.equals(atual.getId())); // Evita auto-tiragem

	        amigosSorteados.add(amigoSecreto);
	        
            String conteudoEmail = "Olá "
            		+ atual.getNome() 
            		+ "! Seu amigo secreto é: "
            		+ amigoSecreto.getNome()
            		+ "\n e seu amigo secreto deu a sugestão de ganhar: "
            		+ "\n*" + amigoSecreto.getPresente1()
            		+ "\n*" + amigoSecreto.getPresente2()
            		+ "\n*" + amigoSecreto.getPresente3()
            		+ "\n"
    				+ "\n Lembrando que isso é apenas uma sugestão de presente do que seu amigo secreto gostaria de ganhar, caso não saiba o que escolher de presente";
            enviaEmailService.enviar(atual.getEmail(), "Amigo Secreto", conteudoEmail);
	    }

	    return amigosSorteados;
	}
}
