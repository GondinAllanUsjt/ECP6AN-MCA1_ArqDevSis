package br.usjt.AtividadeJPA.tempoJPA.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.AtividadeJPA.tempoJPA.model.Cidade;
import br.usjt.AtividadeJPA.tempoJPA.repository.CidadeRepository;


public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepo;
	
	public void salvar(Cidade cidade) {
		cidadeRepo.save(cidade);
	}
}
