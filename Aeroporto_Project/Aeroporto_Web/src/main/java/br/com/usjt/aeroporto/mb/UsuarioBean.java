package br.com.usjt.aeroporto.mb;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import br.com.usjt.aeroporto.entity.Usuario;

@ManagedBean
@Component
@Scope("session")
public class UsuarioBean {

	private Usuario usuario;

	public UsuarioBean() {
		usuario = new Usuario();
		SecurityContext context = SecurityContextHolder.getContext();
		if (context instanceof SecurityContext) {
			Authentication authentication = context.getAuthentication();
			if (authentication instanceof Authentication) {
				usuario.setLogin(((Usuario) authentication.getPrincipal()).getUsername());
			}
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
