package com.example.MyProject.utilpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class Emailsmtp {
       @Autowired
       private JavaMailSender smtp;
       @Value("${spring.mail.username}")
        private String fromAddress;
        public void sendMail(String ToAddress) {
                MimeMessage mm = smtp.createMimeMessage();
                MimeMessageHelper mmh = new MimeMessageHelper(mm);
        try {
           mmh.setTo(ToAddress);
           String subject = "You have become a part of the Editor community!,Now you can create your own masterpieces";
           String Body = "Thanking for joining us!!!!";
           mmh.setSubject(subject);
           mmh.setText(Body);
           smtp.send(mm);
           }
        catch(MessagingException e) {
        e.printStackTrace();

        }
     }
}
