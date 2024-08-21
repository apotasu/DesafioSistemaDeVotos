package desafiovotos.pautas.config;

import desafiovotos.pautas.entity.Pauta;
import desafiovotos.pautas.service.PautaService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PautaConfig {
    @Autowired
    private PautaService pautaService;

    @PostConstruct
    public void init(){
        Pauta exemplo = new Pauta("Investir em cachorrinhos");
        pautaService.createNewPauta(exemplo);
    }
}
