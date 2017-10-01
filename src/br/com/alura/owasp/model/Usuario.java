package br.com.alura.owasp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String email;
	@NotNull (message="Por favor insira a senha!")
	private String senha;
	@NotNull (message="Por favor insira seu nome!")
	private String nome;
	private String role = "ROLE_USER";
	@Transient
	@NotNull (message="Por favor, coloque uma imagem!")
	private MultipartFile imagem;
	@NotNull
	private String nomeImagem;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public MultipartFile getImagem() {
		return imagem;
	}

	public void setImagem(MultipartFile imagem) {
		this.imagem = imagem;
	}

	public String getNomeImagem() {
		return nomeImagem;
	}

	public void setNomeImagem(String nomeImagem) {
		this.nomeImagem = nomeImagem;
	}

}
