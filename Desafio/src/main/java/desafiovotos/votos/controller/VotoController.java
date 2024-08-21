package desafiovotos.votos.controller;

import desafiovotos.pessoa.repository.PessoaRepository;
import desafiovotos.votos.entity.Voto;
import desafiovotos.votos.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/votos")
public class VotoController {
    @Autowired
    private VotoService votoService;
    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Voto> getVotos(){
        return votoService.getVotos();
    }
}
