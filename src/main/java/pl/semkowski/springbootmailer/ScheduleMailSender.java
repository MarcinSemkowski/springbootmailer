package pl.semkowski.springbootmailer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduleMailSender {


 /*
    @Schedules({
     @Scheduled(fixedDelay = 5000),
     @Scheduled(fixedDelay = 2000)
    })

  */
public void init(){
    System.out.println(LocalDateTime.now());
}


}
