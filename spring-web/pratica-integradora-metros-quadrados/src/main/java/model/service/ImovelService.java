package model.service;

import model.dto.ImovelDTO;
import model.entity.Imovel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelService {

    @Autowired
    private ModelMapper modelMapper;
    private Imovel imovel;

    public double getTamanho() {
        this.imovel = new Imovel();
        return imovel.getTamanho();
    }

    public ImovelDTO convertDTO() {
        this.imovel = new Imovel();
        return modelMapper.map(imovel, ImovelDTO.class);
    }


}
