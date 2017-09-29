package br.com.alura.owasp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.alura.owasp.model.BlogPost;

@Repository
public class BlogDaoImpl implements BlogDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void salvaBlogPost(BlogPost post) {
		manager.persist(post);
	}

	@Override
	public List<BlogPost> buscaMensagens() {
		return manager.createQuery("select b from BlogPost b", BlogPost.class)
				.getResultList();
	}

}
