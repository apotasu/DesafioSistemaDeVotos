package desafiovotos.pessoa.config;

import desafiovotos.pessoa.entity.Pessoa;
import desafiovotos.pessoa.service.PessoaService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaConfig {

    @Autowired
    public PessoaService pessoaService;
    @PostConstruct
    public void init(){
        Pessoa exemplo = new Pessoa("Teste", "12345678912");
        pessoaService.addNewPessoa(exemplo);
    }
}
