package com.example.springweb.controller.praticaintegradaromanos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanosController {

    public int [] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public String [] letras = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    //Exemplo de chamada -> http://localhost:8080/convNumbers/23
    @GetMapping("convNumbers/{number}")
    public String roman(@PathVariable int number){
        String romano="";
        for(int i=0; i<valores.length;i++){
            while(number>=valores[i]){
                number-=valores[i];
                romano+=letras[i];
            }
        }
        return romano;
    }

    //Exemplo de chamada -> http://localhost:8080/convNumbers?number=23
    @GetMapping("convNumbers")
    public String roman01(@RequestParam int number){
        String romano="";
        for(int i=0; i<valores.length;i++){
            while(number>=valores[i]){
                number-=valores[i];
                romano+=letras[i];
            }
        }
        return romano;
    }
}
