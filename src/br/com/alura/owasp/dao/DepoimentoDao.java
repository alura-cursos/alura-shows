package br.com.alura.owasp.dao;

import java.util.List;

import br.com.alura.owasp.model.Depoimento;

public interface DepoimentoDao {
	
	public void salvaDepoimento(Depoimento post);
	public List<Depoimento> buscaMensagens();
}
