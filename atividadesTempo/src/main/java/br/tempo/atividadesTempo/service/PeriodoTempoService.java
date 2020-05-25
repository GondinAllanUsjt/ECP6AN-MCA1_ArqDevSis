package br.tempo.atividadesTempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.tempo.atividadesTempo.model.Periodo;
import br.tempo.atividadesTempo.repository.PeriodoTempoRepository;

@Service
public class PeriodoTempoService {


	@Autowired
	private PeriodoTempoRepository periodoTempoRepo;

	public void salvar(Periodo periodo) {
		periodoTempoRepo.save(periodo);
	}

	public List<Periodo> listarTodos() {
		List <Periodo> periodos = periodoTempoRepo.findAll();
		return periodos;
	}
}