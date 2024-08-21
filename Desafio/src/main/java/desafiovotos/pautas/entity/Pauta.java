package desafiovotos.pautas.entity;

import desafiovotos.pessoa.entity.Pessoa;
import desafiovotos.votos.entity.Voto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Timer;
import java.util.List;
import java.util.TimerTask;


@Entity
public class Pauta{
    @Id
    @GeneratedValue
    private Long id;

    private String descricao;
    private static Timer duracao;
    @OneToMany
    private List<Voto> votos;
    private boolean decicaoFinal;

    public Pauta(String descricao, Long tempo) {
        this.descricao = descricao;
        comercarTimer(tempo);
    }

    public Pauta(String descricao) {
        this.descricao = descricao;
        comercarTimer(60000L);
    }

    public Pauta() {

    }

    public boolean terminarVotacao(){
        int countSim = 0;
        int countNao = 0;
        for (int i = 0; i<votos.size(); i++){
            if (votos.get(i).getEscolha()){
                countSim++;
            } else {
                countNao++;
            }
        }
        if (countSim>countNao){
            return true;
        } else {
            return false;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static Timer getDuracao() {
        return duracao;
    }

    public static void setDuracao(Timer duracao) {
        Pauta.duracao = duracao;
    }

    public Object getDecicaoFinal() {
        if (votos.isEmpty()){
            return null;
        } else {
            return decicaoFinal;
        }
    }

    public void setDecicaoFinal(boolean decicaoFinal) {
        this.decicaoFinal = decicaoFinal;
    }

    public void Votar(Voto voto){
        votos.add(voto);
    }
    private void comercarTimer(Long tempo) {
        this.duracao = new Timer();
        this.duracao.schedule(new TimerTask() {
            @Override
            public void run() {
                terminarVotacao();
            }
        }, tempo);
    }
}
