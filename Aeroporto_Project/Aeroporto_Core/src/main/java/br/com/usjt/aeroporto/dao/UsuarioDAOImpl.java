package br.com.usjt.aeroporto.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.usjt.aeroporto.entity.Usuario;

@Repository("usuarioDAO")
@Transactional
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements UsuarioDAO, Serializable {

	private static final long serialVersionUID = 1850233015090018169L;

	public UsuarioDAOImpl() {
		super(Usuario.class);
	}

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException, DataAccessException {
        Query query = getCurrentSession().createQuery(
                        " Select u from SYS_USER u join fetch u.grupos as g left join fetch g.direitos as p where u.login=:pLogin");
		query.setParameter("pLogin", login);
		List<?> resultList = query.getResultList();

		if (resultList != null) {
            return (Usuario) resultList.get(0);
        }

		return null;
	}
}
