package com.koliver.emailservice.adapters;

//contrato para que a aplicação interaga com serviços de fora
public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
