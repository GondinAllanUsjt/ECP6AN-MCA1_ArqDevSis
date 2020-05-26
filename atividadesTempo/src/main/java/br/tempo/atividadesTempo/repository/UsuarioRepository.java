package br.tempo.atividadesTempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.tempo.atividadesTempo.model.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
	
}
