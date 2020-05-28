package br.usjt.AtividadeJPA.tempoJPA.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_clima")
@Data @AllArgsConstructor @NoArgsConstructor// faz praticamente tudo get set e bla bla bla
public class Clima {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column (nullable = false, length = 200)
	private int minima;
	
	@Column (nullable = false, length = 30)
	private int maxima;
	
	@Column (nullable = true, length = 100)
	private double umidade;
	
	@Column (nullable = true, length = 100)
	private String descricao;
	
	@Temporal(TemporalType.DATE) 
	@Column (nullable = true, length = 100)
	private Date data;
	
	@Column (nullable = true, length = 100)
	private double latitude;
	
	@Column (nullable = true, length = 100)
	private double longitude;
	
	
	@OneToOne (optional = false)
	@JoinColumn (name = "id_da_semana")
	private Semana semana;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Cidade cidade;
	
	public String toString() {
		return semana.getSemana() + minima + maxima + umidade + descricao + data + latitude + longitude;
	}
	
}