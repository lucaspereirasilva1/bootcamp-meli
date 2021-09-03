package controller;

import model.dto.ImovelDTO;
import model.dto.QuartoDTO;
import model.service.ImovelService;
import model.service.QuartoService;
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
    public double retornarTamanhoImovel() {
        this.imovelDTO = new ImovelDTO();
        this.imovelDTO = imovelService.convertDTO();
        return this.imovelDTO.getTamanho();
    }

    @GetMapping("/cvi")
    public double calcularValorImovel() {
        ImovelDTO imovelDto = new ImovelDTO();
        imovelDto.setTamanho(imovelService.getTamanho());
        return imovelDto.getTamanho() * 800;
    }

    @GetMapping("/listarquartos")
    public List<QuartoDTO> listarQuartos() {
        List<QuartoDTO> listaDto = new ArrayList<>();
        for (int i = 0; i < quartoService.criarQuartos().size(); i++) {
            QuartoDTO quartoDto = new QuartoDTO();
            quartoDto.setComprimento(quartoService.quartoRecebendoId(i).getComprimento());
            quartoDto.setNome(quartoService.quartoRecebendoId(i).getNome());
            quartoDto.setLargura(quartoService.quartoRecebendoId(i).getLargura());
            listaDto.add(quartoDto);
        }
        return listaDto;
    }
}



