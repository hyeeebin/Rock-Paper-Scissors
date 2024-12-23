package com.game.play;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PlayController {
    
    //가위바위보 연산
    @GetMapping("/api/about")
    public String game(@RequestParam String inputValue) throws Exception{
        //String rsp = "205";

        String answer = "";
        
        char a;
        String b;

        for(int i = 0; i<inputValue.length(); i++){
            a = inputValue.charAt(i);

            if(a == '2'){
                b = "0";
                answer = answer+b;
            }else if( a == '0'){
                b = "5";
                answer = answer+b;
            }else if( a == '5'){
                b = "2";
                answer = answer+b;
            }

        }
        System.out.println(answer);
        
        return answer;
    }
}
