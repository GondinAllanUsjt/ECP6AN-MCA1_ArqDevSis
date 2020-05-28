package br.usjt.AtividadeJPA.tempoJPA;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtAtiv");
	}
}
