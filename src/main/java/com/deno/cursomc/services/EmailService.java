package com.deno.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.deno.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
