package br.edu.iftm.atividadeComplementar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;

import br.edu.iftm.atividadeComplementar.domains.Atividade;
import br.edu.iftm.atividadeComplementar.domains.LancamentoAtividade;

@SpringBootApplication
public class AtividadeComplementarStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeComplementarStsApplication.class, args);
		
		
		
		
		System.out.println("----------------aqui ta a atividade------------------");
		
		Atividade atividade = new Atividade(null, "monitoria", 50, 1,
				50);
		Atividade atividade2 = new Atividade(null,"estagio",40,2,50);
		System.out.println(atividade.getNome());
		System.out.println(atividade.getValorLimiteHorasAtividade(60));
		System.out.println(atividade.getHorasAproveitadasPorAtividade(60));
		
		
//		 Cursos e mini-cursos 
//		 Palestras
//		 Atividades técnico-científicas 
//		 Publicação de artigos 
//		Publicação de livros ou capítulo de livro 
//		Publicação em boletins técnicos 
//		 Palestras proferidas 
//		 Atividades artístico- cultural 
		 //Atividades esportivas 
//		getHorasAproveitadasPorAtividade;
		LancamentoAtividade lancamento = new LancamentoAtividade(null,51,null,null,null,atividade);
		LancamentoAtividade lancamento2 = new LancamentoAtividade(null,51,null,null,null,atividade2);

		System.out.println("----------------aqui ta o lancamento------------------");
		System.out.println(lancamento.getAtividade().getNome());
		System.out.println(lancamento.getHorasAproveitadas(atividade,60,50,null));
		System.out.println(lancamento2.getHorasAproveitadas(atividade2,60,50,null));
	}
}
