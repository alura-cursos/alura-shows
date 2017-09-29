package br.com.alura.owasp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.alura.owasp.model.Usuario;
import br.com.alura.owasp.util.ConnectionFactory;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao{

	//Será usado na primeira aula, depois mudaremos para o EntityManager
	Connection connection = new ConnectionFactory().getConnection();

	//Será usado mais adiante
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
}
