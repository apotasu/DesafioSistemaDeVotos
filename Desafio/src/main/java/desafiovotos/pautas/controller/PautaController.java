package desafiovotos.pautas.controller;


import desafiovotos.pautas.entity.Pauta;
import desafiovotos.pautas.service.PautaService;
import desafiovotos.pessoa.entity.Pessoa;
import desafiovotos.pessoa.repository.PessoaRepository;
import desafiovotos.votos.entity.Voto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pautas")
public class PautaController {
    @Autowired
    private PautaService pautaService;

    @GetMapping
    public List<Pauta> getPautas(){
        return pautaService.getPautas();
    }

    @PostMapping(path = "{pautaId}")
    public void votar(@RequestBody boolean escolha, @PathVariable ("pautaId") String documento){
        pautaService.Votar(documento, escolha);
    }

    @PostMapping
    public void makeNewPauta(@RequestBody Pauta pauta){
        pautaService.createNewPauta(pauta);
    }

}
