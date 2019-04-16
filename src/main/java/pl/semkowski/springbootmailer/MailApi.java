package pl.semkowski.springbootmailer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.time.LocalDate;

@RestController
public class MailApi {

    private JavaMailSender javaMailSender;
    private MailService mailService;

     @Autowired
    public MailApi(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/sendMail")
    @Scheduled(fixedDelay = 5000)
    public String sendEmail() throws MessagingException {
     mailService.sendMail("7ahwqmcoonmn@10minut.xyz","Chora_curka","Dej");
     return "Jest";
    }


}
