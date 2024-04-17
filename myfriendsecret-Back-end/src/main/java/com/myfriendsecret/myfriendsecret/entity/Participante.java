package com.myfriendsecret.myfriendsecret.entity;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Participante {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;

	private String nome;
	private String email;
	private String presente1;
	private String presente2;
	private String presente3;
	
	//Construtores
	public Participante(Integer id, String nome, String email, String presente1, String presente2, String presente3) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.presente1 = presente1;
		this.presente2 = presente2;
		this.presente3 = presente3;
	}

	public Participante() {
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPresente1() {
		return presente1;
	}

	public void setPresente1(String presente1) {
		this.presente1 = presente1;
	}

	public String getPresente2() {
		return presente2;
	}

	public void setPresente2(String presente2) {
		this.presente2 = presente2;
	}

	public String getPresente3() {
		return presente3;
	}

	public void setPresente3(String presente3) {
		this.presente3 = presente3;
	}
	
	
	
	
	
}
