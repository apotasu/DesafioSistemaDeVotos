package desafiovotos.pautas.controller;


import desafiovotos.pautas.service.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pautas")
public class PautaController {
    @Autowired
    private PautaService pautaService;

    @GetMapping
    public void getPautas(){
        pautaService.getPautas();
    }

    @PostMapping(path = "{pautaId}")
    public void makeNewPauta(){
        pautaService.getPautas();
    }

}
