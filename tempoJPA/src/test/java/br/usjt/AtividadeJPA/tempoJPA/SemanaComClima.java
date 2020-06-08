package br.usjt.AtividadeJPA.tempoJPA;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.AtividadeJPA.tempoJPA.model.Cidade;
import br.usjt.AtividadeJPA.tempoJPA.model.Clima;
import br.usjt.AtividadeJPA.tempoJPA.model.Semana;
import br.usjt.AtividadeJPA.tempoJPA.repository.JPAUtil;

public class SemanaComClima {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Semana s = new Semana();
		s.setSemana("Segunda");
		manager.persist(s);
		Cidade ci = new Cidade();
		ci.setNome("Mauá");
		ci.setLatitude(-13.3723);
		ci.setLongitude(-36.3304);
		manager.persist(ci);
		Clima c = new Clima(null, 12, 16, 0.4, "Funcionou",
				new java.sql.Date(format.parse("05/06/2020").getTime()), s, ci);
		manager.persist(c);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}