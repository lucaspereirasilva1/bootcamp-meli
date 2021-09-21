package br.com.meli.diploma.controller;

import br.com.meli.diploma.model.dto.AlunoDTO;
import br.com.meli.diploma.model.dto.DiplomaDTO;
import br.com.meli.diploma.model.service.AlunoService;
import br.com.meli.diploma.model.service.DiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/diploma")
public class AlunoController {

    @Autowired
    AlunoService alunoService;
    @Autowired
    DiplomaService diplomaService;

    @PostMapping(value = "/cadastro", produces = "application/json")
    public AlunoDTO cadastrarAluno(@RequestBody AlunoDTO alunoDTO) {
        return alunoService.cadastrar(alunoDTO);
    }

    @GetMapping(value = "/listaalunos")
    public List<AlunoDTO> retornarListaAlunos() {
        return alunoService.retornarLista();
    }

    @GetMapping(value = "/buscapornome/{nome}")
    public AlunoDTO buscarPorNome(@PathVariable String nome) {
        return alunoService.buscarPorNome(nome);
    }

    @GetMapping(value = "/geradiploma/{nome}")
    public DiplomaDTO gerarDiploma(@PathVariable String nome) {
        return diplomaService.gerar(nome);
    }

    @DeleteMapping(value = "/deletaaluno/{id}")
    public String removerAluno(@PathVariable Integer id) {
        return alunoService.removerAluno(id) ? "Aluno removido" : "Aluno nao removido";
    }
}
