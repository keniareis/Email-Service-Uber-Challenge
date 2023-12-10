package com.koliver.emailservice.core;

//logica de negocios
//Definiu uma interface que vai ser o contrato que define o comportamento da aplicação
public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
