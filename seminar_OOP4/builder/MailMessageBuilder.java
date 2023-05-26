package ru.geekbrains.lesson7.builder;

public class MailMessageBuilder {

    private final MailMessage mailMessage = new MailMessage();

    public MailMessage build(){

        if (mailMessage.getTo() == null || mailMessage.getTo().equals(""))
            throw new RuntimeException("Получатель должен быт указан!");

        return mailMessage;
    }

    public MailMessageBuilder setFrom(String address){
        mailMessage.setFrom(address);
        return this;
    }

    public MailMessageBuilder setTo(String address){
        mailMessage.setTo(address);
        return this;
    }

    public MailMessageBuilder setSubject(String subject){
        mailMessage.setSubject(subject);
        return this;
    }

    public MailMessageBuilder setBody(String body){
        mailMessage.setBody(body);
        return this;
    }

}
