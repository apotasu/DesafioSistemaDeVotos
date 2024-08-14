package desafiovotos.pautas.service;

import desafiovotos.pautas.entity.Pauta;
import desafiovotos.pautas.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PautaService {
    @Autowired
    private PautaRepository pautaRepository;
    public List<Pauta> getPautas(){
        return pautaRepository.findAll();
    }
    public void createNewPauta(Pauta pauta){
        pautaRepository.save(pauta);
    }
}
