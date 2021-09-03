package com.example.demo.model.service;

import com.example.demo.model.dto.ImovelDTO;
import com.example.demo.model.entity.Imovel;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Data
@Service
public class ImovelService {


    private ModelMapper modelMapper = new ModelMapper();

    public ImovelDTO imovelConvert(){
        Imovel imovel = new Imovel();
        return modelMapper.map(imovel, ImovelDTO.class);
    }

    public double getTamanho() {
        Imovel imovel = new Imovel();
        return imovel.getTamanho();
    }


}
