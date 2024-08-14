package desafiovotos.pautas.entity;

import desafiovotos.votos.entity.Voto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.sql.Time;
import java.util.ArrayList;

@Entity
public class Pauta {
    @Id
    @GeneratedValue
    private Long id;

    private String descricao;
    private Time duracao;
    @OneToMany
    private ArrayList<Voto> votos;
    private boolean decicaoFinal;

    public Pauta(String descricao, Time duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public Pauta(String descricao) {
        this.descricao = descricao;
        this.duracao = Time.valueOf("60");
    }

    public Pauta() {

    }

    public boolean isDecicaoFinal() {
        return decicaoFinal;
    }

    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
}
