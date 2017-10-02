package br.com.alura.owasp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.alura.owasp.model.Usuario;
import br.com.alura.owasp.util.ConnectionFactory;

@Repository
public class UsuarioDaoImpl implements UsuarioDao{

	//Ser� usado na primeira aula, depois mudaremos para o EntityManager
	Connection connection = new ConnectionFactory().getConnection();

	//Ser� usado mais adiante
	@PersistenceContext
	private EntityManager manager;

	public void salva(Usuario usuario) {
		String query = "insert into usuarios (email,senha,nome,role,nomeImagem) values ('"
				+ usuario.getEmail() + "','" + usuario.getSenha() + "','"+usuario.getNome()+"','"
				+ usuario.getRole() + "','"+usuario.getNomeImagem()+"');";
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Usuario procuraUsuario(Usuario usuario) {
		String query = "SELECT * FROM usuarios WHERE email=" + "'"
				+ usuario.getEmail() + "'" + " and senha=" + "'"
				+ usuario.getSenha() + "';";
		try {
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery(query);
			Usuario usuarioRetorno = new Usuario();
			while (results.next()) {
				usuarioRetorno.setEmail(results.getString("email"));
				usuarioRetorno.setSenha(results.getString("senha"));
				usuarioRetorno.setNomeImagem(results.getString("nomeImagem"));
				usuarioRetorno.setNome(results.getString("nome"));
			}
			if (usuarioRetorno.getEmail() == null
					&& usuarioRetorno.getSenha() == null) {
				return null;
			} else {
				return usuarioRetorno;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public boolean verificaSeUsuarioEhAdmin(Usuario usuario) {
		TypedQuery<Usuario> query = manager
				.createQuery(
						"select u from Usuario u where u.email =:email and u.senha =:senha",
						Usuario.class);
		query.setParameter("email", usuario.getEmail());
		query.setParameter("senha", usuario.getSenha());
		Usuario retornoUsuario = query.getResultList()
				.stream().findFirst().orElse(null);
		if (retornoUsuario != null
				&& retornoUsuario.getRole().equals("ROLE_ADMIN")) {
			return true;
		} else {
			return false;
		}
	}
}
