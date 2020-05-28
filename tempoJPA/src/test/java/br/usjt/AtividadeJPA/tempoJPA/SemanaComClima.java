package br.usjt.AtividadeJPA.tempoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import br.usjt.AtividadeJPA.tempoJPA.model.Clima;
import br.usjt.AtividadeJPA.tempoJPA.model.Semana;
import br.usjt.AtividadeJPA.tempoJPA.repository.JPAUtil;

public class SemanaComClima {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = new Semana();
		s.setSemana("Segunda");
		manager.persist(s);
		Clima c = new Clima();
		//c.setData("01/01/2020");
		c.setDescricao("Dia ensolarado");
		c.setLatitude(-23.46555);
		c.setLongitude(-40.45688);
		c.setMinima(16);
		c.setMaxima(20);
		c.setUmidade(0.5);
		c.setSemana(s);
		manager.persist(c);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}