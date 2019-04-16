package pl.semkowski.springbootmailer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {



    @GetMapping
   public String get(@RequestParam String name){
     if(name.length() <= 1){

     }
     return "";
   }
}
