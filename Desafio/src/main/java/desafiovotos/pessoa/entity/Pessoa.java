package desafiovotos.pessoa.entity;

import desafiovotos.votos.entity.Voto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Pessoa {
    private String nome;
    @Id
    @GeneratedValue
    private Long id;

    private String documento;

    @OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private Voto voto;

    public Pessoa(String nome, Long id, String documento) {
        this.nome = nome;
        this.id = id;
        this.documento = documento;
    }

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
