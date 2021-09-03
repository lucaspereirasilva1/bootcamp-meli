package com.example.demo.controller;

import com.example.demo.model.dto.ImovelDTO;
import com.example.demo.model.dto.QuartoDTO;
import com.example.demo.model.service.ImovelService;
import com.example.demo.model.service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;
    @Autowired
    private QuartoService quartoService;
    private ImovelDTO imovelDTO;

    @GetMapping("/rti")
    public double retornarTamanhoImovel(){
        imovelDTO = imovelService.imovelConvert();
        return imovelDTO.getTamanho();
    }

    @GetMapping("/cvi")
    public double calcularValorImovel(){
        imovelDTO = imovelService.imovelConvert();
        return imovelDTO.getTamanho()*800;
    }

    @GetMapping("/listarquartos")
    public List<QuartoDTO> listarQuartos(){
        List<QuartoDTO> listaDto = new ArrayList<>();
        for (int i = 0; i < quartoService.criarQuartos().size() ;i++){
            QuartoDTO quartoDto = new QuartoDTO();
            quartoDto.setComprimento(quartoService.quartoRecebendoId(i).getComprimento());
            quartoDto.setNome(quartoService.quartoRecebendoId(i).getNome());
            quartoDto.setLargura(quartoService.quartoRecebendoId(i).getLargura());
            listaDto.add(quartoDto);
        }
        return listaDto;
    }



}
