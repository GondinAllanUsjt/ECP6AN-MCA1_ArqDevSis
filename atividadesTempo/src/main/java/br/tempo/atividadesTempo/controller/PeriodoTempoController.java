package br.tempo.atividadesTempo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.tempo.atividadesTempo.model.Periodo;
import br.tempo.atividadesTempo.service.PeriodoTempoService;

@Controller
public class PeriodoTempoController {
	
	@Autowired
	private PeriodoTempoService PeriodoTempoService;
	
	@GetMapping("/previsao")
	public ModelAndView listarPeriodos() {
		ModelAndView mv = new ModelAndView("lista_periodos");
		mv.addObject(new Periodo());
		List<Periodo> periodos = PeriodoTempoService.listarTodos(); // traz todos FindAll
		mv.addObject("periodos", periodos);
		return mv;
	}
}
