/**
 * 
 */
package br.com.usjt.aeroporto.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.usjt.aeroporto.entity.Aeronave;

/**
 * @author thiagosouzacardoso
 * 
 */
@Repository("AeronaveDAO")
@Transactional
public class AeronaveDAOImpl extends GenericDAOImpl<Aeronave> implements AeronaveDAO, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 381238653913159814L;

	public AeronaveDAOImpl() {
		super(Aeronave.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Aeronave> findAllName(String name) {
		Query query = getCurrentSession().createQuery("from " + classe.getName() + " a where a.nome = :pNome");
		query.setParameter("pNome", name);
		return query.getResultList();
	}

}
