package desafiovotos.pautas.entity;

import desafiovotos.votos.entity.Voto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Time;
import java.util.ArrayList;

public class Pauta {
    @Id
    @GeneratedValue
    private Long id;

    private String descricao;
    private Time duracao;
    private ArrayList<Voto> votos;

    public Pauta(String descricao, Time duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public Pauta(String descricao) {
        this.descricao = descricao;
        this.duracao = Time.valueOf("60");
    }

    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
}
