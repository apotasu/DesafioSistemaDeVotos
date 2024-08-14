package desafiovotos.votos.controller;

import desafiovotos.votos.entity.Voto;
import desafiovotos.votos.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping
    public void AddNewVoto(@RequestBody Voto voto){
        votoService.addNewVoto(voto);
    }
    @GetMapping
    public List<Voto> getVotos(){
        return votoService.getVotos();
    }
}
