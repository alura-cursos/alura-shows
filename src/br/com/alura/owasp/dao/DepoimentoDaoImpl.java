package br.com.alura.owasp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.alura.owasp.model.Depoimento;

@Repository
public class DepoimentoDaoImpl implements DepoimentoDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void salvaDepoimento(Depoimento post) {
		manager.persist(post);
	}

	@Override
	public List<Depoimento> buscaMensagens() {
		return manager.createQuery("select d from Depoimento d", Depoimento.class)
				.getResultList();
	}

}
