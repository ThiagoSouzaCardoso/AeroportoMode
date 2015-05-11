package br.com.usjt.aeroporto.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
@Transactional
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	protected Class<T> classe;

    @PersistenceContext
	protected EntityManager entityManager;

	public GenericDAOImpl(Class<T> classe) {
		this.classe = classe;
	}

	@Override
	public void save(T t) {

		getCurrentSession().persist(t);

	}

	@Override
	public void update(T t) {
		getCurrentSession().merge(t);

	}

	@Override
	public void delete(T t) {
		getCurrentSession().remove(t);
	}

	@Override
	public T findById(Long id) {
		return getCurrentSession().find(classe, id);
	}

	@Override
	public List<T> findByAll() {
		Query query = getCurrentSession().createQuery("from " + classe.getName());
		return query.getResultList();
	}

	public EntityManager getCurrentSession() {
		return entityManager;
	}

}
