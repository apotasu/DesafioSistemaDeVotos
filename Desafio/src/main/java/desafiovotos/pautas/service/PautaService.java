package desafiovotos.pautas.service;

import desafiovotos.pautas.entity.Pauta;
import desafiovotos.pautas.repository.PautaRepository;
import desafiovotos.pessoa.repository.PessoaRepository;
import desafiovotos.votos.entity.Voto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PautaService {
    @Autowired
    private PautaRepository pautaRepository;
    @Autowired
    private PessoaRepository pessoaRepository;
    public List<Pauta> getPautas(){
        return pautaRepository.findAll();
    }

    public void Votar(String documento, boolean escolha){
        Voto voto = new Voto(pessoaRepository.findPessoaByDocumento(documento).get(), escolha);
        pautaRepository.findById(1L).get().Votar(voto);
    }


    public void createNewPauta(Pauta pauta){
        pautaRepository.save(pauta);
    }

}
