package br.com.usjt.aeroporto.dao;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.com.usjt.aeroporto.entity.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario>, UserDetailsService {

}
