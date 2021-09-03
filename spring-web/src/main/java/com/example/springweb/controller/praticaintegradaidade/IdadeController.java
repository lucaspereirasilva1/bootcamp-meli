package com.example.springweb.controller.praticaintegradaidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@RestController
public class IdadeController {

    @GetMapping("idade/{dia}/{mes}/{ano}")
    public int idadeGet(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano) throws ParseException {
        String dataRecebida = dia.toString() + "/" + mes.toString() + "/" + ano.toString();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataConvertida = simpleDateFormat.parse(dataRecebida);
        Calendar data = Calendar.getInstance();
        Calendar dataAtual= Calendar.getInstance();
        data.setTime(dataConvertida);
        data.set(Calendar.YEAR, dataAtual.get(Calendar.YEAR));
        int idade = data.after(dataAtual) ? -1 : 0;
        data.setTime(dataConvertida);
        idade += dataAtual.get(Calendar.YEAR) - data.get(Calendar.YEAR);
        return idade;
    }

}
