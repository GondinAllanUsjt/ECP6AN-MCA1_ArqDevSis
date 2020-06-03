package br.usjt.AtividadeJPA.tempoJPA.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_semana")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Semana implements Serializable {
	
	private static final long serialVersionUID = 7L;
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 100)
	private String semana;

	@OneToMany (mappedBy = "semana", cascade = CascadeType.ALL)
	private List <Clima> clima;
}
