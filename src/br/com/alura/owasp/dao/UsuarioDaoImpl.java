package br.com.alura.owasp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Repository;

import br.com.alura.owasp.model.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	@PersistenceContext
	private EntityManager manager;

	public void salva(Usuario usuario) {
		transformaASenhaDoUsuarioEmHash(usuario);
		manager.persist(usuario);
	}

	private void transformaASenhaDoUsuarioEmHash(Usuario usuario) {
		String salto = BCrypt.gensalt();
		String senhaHashed = BCrypt.hashpw(usuario.getSenha(), salto);
		usuario.setSenha(senhaHashed);
	}

	public Usuario procuraUsuario(Usuario usuario) {
		TypedQuery<Usuario> query = manager
				.createQuery("select u from Usuario u where u.email=:email and u.senha=:senha ", Usuario.class);
		query.setParameter("email", usuario.getEmail());
		query.setParameter("senha", usuario.getSenha());
		Usuario usuarioRetornado = query.getResultList().stream().findFirst().orElse(null);
		return usuarioRetornado;
	}
}
