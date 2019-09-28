package com.ionic.service;

import org.springframework.mail.SimpleMailMessage;

import com.ionic.model.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
