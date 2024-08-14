package desafiovotos.votos.service;



import desafiovotos.pessoa.service.PessoaService;
import desafiovotos.votos.entity.Voto;
import desafiovotos.votos.repository.VotoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VotoService {

    @Autowired
    private VotoRepository votoRepository;

    public List<Voto> getVotos() {
        List<Voto> votos = votoRepository.findAll();
        return votos;
    }

    public void addNewVoto(Voto voto) {
        votoRepository.save(voto);
    }

    public void deleteVoto(Long votoId, String documento) {
        boolean exists = votoRepository.existsById(votoId);
        if (!exists) {
            throw new IllegalStateException("Pessoa não existe");
        } else {
            votoRepository.deleteById(votoId);
        }
    }

    public Voto getVotoById(long id) {
        Voto voto = votoRepository.findVotoById(id);
        if (voto == null) {
            throw new IllegalStateException("Voto não encontrado");
        }
        return voto;
    }
}
