package br.com.alura.owasp.dao;

import br.com.alura.owasp.model.Usuario;

public interface UsuarioDao {
	public void salva(Usuario usuario);
	public Usuario procuraUsuario(Usuario usuario);
}
