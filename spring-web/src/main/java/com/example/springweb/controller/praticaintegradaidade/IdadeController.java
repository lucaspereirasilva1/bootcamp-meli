package com.example.springweb.controller.praticaintegradaidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@RestController
public class IdadeController {

    @GetMapping("idade/{dia}/{mes}/{ano}")
    public int idadeGet(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano) throws ParseException {
        LocalDate localDate = LocalDate.now();
        int anoAtual = localDate.getYear();
        return anoAtual - ano;
    }

}
