package desafiovotos.votos.repository;

import desafiovotos.votos.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {
    @Query("SELECT v FROM Voto v WHERE v.id=?1")
    Voto findVotoById(Long id);

}