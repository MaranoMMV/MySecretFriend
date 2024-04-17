package com.myfriendsecret.myfriendsecret.service.email;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EnviaEmailService {

    
    private final JavaMailSender javaMailSender;

    public EnviaEmailService(final JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void enviar(String para, String titulo, String conteudo){
    	System.out.println("Enviando email simples");

        var mensagem = new SimpleMailMessage();
        mensagem.setTo(para);
        mensagem.setSubject(titulo);
        mensagem.setText(conteudo);
        javaMailSender.send(mensagem);
        System.out.println("Email enviado com sucesso!");
    }
}
