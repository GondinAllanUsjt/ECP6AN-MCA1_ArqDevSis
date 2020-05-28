package br.usjt.AtividadeJPA.tempoJPA.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cidade")
@Data @AllArgsConstructor @NoArgsConstructor
public class Cidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double latitude;
	private double longitude;

	@OneToMany (mappedBy = "cidade", cascade = CascadeType.ALL)
	private List <Clima> clima;
}
