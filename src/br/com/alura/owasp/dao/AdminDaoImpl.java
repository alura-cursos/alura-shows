package br.com.alura.owasp.dao;

import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Repository;

import br.com.alura.owasp.model.Role;
import br.com.alura.owasp.model.Usuario;

@Repository
public class AdminDaoImpl implements AdminDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public boolean verificaSeUsuarioEhAdmin(Usuario usuario) {
		TypedQuery<Usuario> query = manager.createQuery(
				"select u from Usuario u where u.email =:email", Usuario.class);
		query.setParameter("email", usuario.getEmail());
		Usuario usuarioRetornado = query.getResultList().stream().findFirst()
				.orElse(null);

		if (validaSenhaDoUsuarioComOHAshDoBanco(usuario, usuarioRetornado)) {
			return verificaSeUsuarioTemRoleAdmin(usuarioRetornado);
		}

		return false;
	}
	
	private boolean validaSenhaDoUsuarioComOHAshDoBanco(Usuario usuario,
			Usuario usuarioRetornado) {
		if (usuarioRetornado == null) {
			return false;
		}
		boolean comparaSenhaComHashESemHash = BCrypt.checkpw(
				usuario.getSenha(), usuarioRetornado.getSenha());
		return comparaSenhaComHashESemHash;
	}

	private boolean verificaSeUsuarioTemRoleAdmin(Usuario usuarioRetornado) {
		return usuarioRetornado.getRoles().stream().map(Role::getName)
				.collect(Collectors.toList()).contains("ROLE_ADMIN");

	}
}
