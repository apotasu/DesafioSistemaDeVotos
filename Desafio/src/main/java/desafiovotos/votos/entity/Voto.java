package desafiovotos.votos.entity;

import desafiovotos.pautas.entity.Pauta;
import desafiovotos.pessoa.entity.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Voto {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    @ManyToOne
    private Pauta pauta;

    private boolean escolha;

    public Voto(Pessoa pessoa, boolean escolha) {
        this.pessoa = pessoa;
        this.escolha = escolha;
    }
    public Voto(){

    }

    public Voto(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    public boolean getEscolha() {
        return escolha;
    }

    public void setEscolha(boolean escolha) {
        this.escolha = escolha;
    }
}
