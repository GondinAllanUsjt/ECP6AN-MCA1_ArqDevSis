package br.usjt.AtividadeJPA.tempoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.AtividadeJPA.tempoJPA.model.Usuario;
import br.usjt.AtividadeJPA.tempoJPA.repository.JPAUtil;

public class TesteInsereUmUsuario {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();// inicio
		Usuario u = new Usuario(null, "admin", "admin");
		manager.persist(u);
		transaction.commit();// manda
		manager.close();// fecha
		JPAUtil.close();
	}

}
