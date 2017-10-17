package br.com.alura.owasp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import br.com.alura.owasp.model.Usuario;
import br.com.alura.owasp.util.ConnectionFactory;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	Connection connection = new ConnectionFactory().getConnection();

	public void salva(Usuario usuario) {
		String query = "insert into USUARIO (email,senha,nome,nomeImagem) values ('"
				+ usuario.getEmail()
				+ "','"
				+ usuario.getSenha()
				+ "','"
				+ usuario.getNome() + "','" + usuario.getNomeImagem() + "');";
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Usuario procuraUsuario(Usuario usuario) {
		String query = "SELECT * FROM USUARIO WHERE email=" + "'"
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
				if(usuarioRetorno.getEmail().equals(usuario.getEmail())){
					break;
				}
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
