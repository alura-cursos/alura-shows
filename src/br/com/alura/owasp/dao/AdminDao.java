package br.com.alura.owasp.dao;

import br.com.alura.owasp.model.Usuario;

public interface AdminDao {
	public boolean verificaSeUsuarioEhAdmin(Usuario usuario);
}
