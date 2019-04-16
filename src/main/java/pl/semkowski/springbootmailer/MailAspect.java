package pl.semkowski.springbootmailer;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MailAspect {

    @Around("@annotation(SendMail)")

    public void get(){
        System.out.println("Wysłano maila");
    }

    @After("@annotation(SendMail)")
    public void getMessage(){

    }


}
