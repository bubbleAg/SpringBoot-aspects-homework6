package com.koro.movies.aspect;

import com.koro.movies.service.MailService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Aspect
@Component
public class MailAspect {

    private MailService mailService;

    @Autowired
    public MailAspect(MailService mailService) {
        this.mailService = mailService;
    }

    @After("@annotation(com.koro.movies.annotation.SendMail)")
    private void sendMail() throws MessagingException {
        mailService.sendMail("EMAIL",
                "New movie added!",
                "<p> Your movie has been added to movie list </p>",
                true);
    }
}
