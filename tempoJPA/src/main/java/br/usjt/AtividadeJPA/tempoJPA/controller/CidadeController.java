package br.usjt.AtividadeJPA.tempoJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import br.usjt.AtividadeJPA.tempoJPA.model.Cidade;
import br.usjt.AtividadeJPA.tempoJPA.service.CidadeService;

public class CidadeController {

	@Autowired
	private CidadeService cidadeService;
	
	@PostMapping("/previsao")
	public String salvar(Cidade cidade) {
		cidadeService.salvar(cidade);
		return "redirect:/previsao";
	}
}
