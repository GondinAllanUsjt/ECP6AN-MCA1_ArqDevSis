package br.usjt.AtividadeJPA.tempoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import java.util.Calendar;
import java.util.Date;
import br.usjt.AtividadeJPA.tempoJPA.model.Clima;
import br.usjt.AtividadeJPA.tempoJPA.repository.JPAUtil;


public class TesteInsereUmUsuario {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();//inicio
		//Clima u = new Clima(null,20, 30, 0.5, "Dia ensolarado",2020-02-02, -23.46652, -43.45568, null);
		//manager.persist(u);
		transaction.commit();//manda
		manager.close();//fecha
		JPAUtil.close();
	}
	
}


