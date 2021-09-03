package com.example.demo.model.service;

import com.example.demo.model.entity.Quarto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuartoService {

    public List<Quarto> criarQuartos(){
        Quarto quarto1 = new Quarto("quarto_filha",3.0,3.0);
        Quarto quarto2 = new Quarto("quarto_filho",2.0,4.0);
        List<Quarto> lista = new ArrayList<>();
        lista.add(quarto1);
        lista.add(quarto2);
        return lista;
    }
    public Quarto quartoRecebendoId(int id){
        List<Quarto> lista = this.criarQuartos();
        Quarto quarto = null;
        for (int i = 0; i < lista.size(); i++){
            if (i == id){
                quarto = lista.get(i);
            }
        }
        return quarto;
    }
}
