package br.tempo.atividadesTempo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.tempo.atividadesTempo.model.Usuario;
import br.tempo.atividadesTempo.repository.UsuarioRepository;


@Service
public class LoginService {
	
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar(Usuario usuario) {
		
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}

