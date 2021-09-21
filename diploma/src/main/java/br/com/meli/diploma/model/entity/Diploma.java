package br.com.meli.diploma.model.entity;

import br.com.meli.diploma.model.dto.AlunoDTO;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class Diploma {

    private Integer id;
    private Aluno aluno;
    private BigDecimal media;
    private String mensagem;

    public Diploma comId(Integer id){
        this.id = id;
        return this;
    }

    public Diploma comAluno(Aluno aluno){
        this.aluno = aluno;
        return this;
    }

    public Diploma comMedia(BigDecimal media){
        this.media = media;
        return this;
    }

    public Diploma comMensagem(String mensagem){
        this.mensagem = mensagem;
        return this;
    }

    public Diploma build(){
        return this;
    }

}
