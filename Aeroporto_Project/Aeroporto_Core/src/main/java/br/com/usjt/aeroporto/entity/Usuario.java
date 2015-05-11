package br.com.usjt.aeroporto.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity(name = "SYS_USER")
public class Usuario implements UserDetails {

	private static final long serialVersionUID = -8306879394124703101L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
	private Long id;
	private String login;
	private String senha;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Grupo> grupos;

    @Transient
    private final String PERMISSION_PREFIX = "ROLE_RIGHT_";

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<PermissionAuthority> authorities = new HashSet<PermissionAuthority>();
        for (Grupo role : grupos) {
            for (Direito right : role.getDireitos()) {
                PermissionAuthority produxAuthority = new PermissionAuthority(PERMISSION_PREFIX + right.getNome());
                authorities.add(produxAuthority);
            }
            PermissionAuthority permissionAuthority = new PermissionAuthority(role.getNome());
            authorities.add(permissionAuthority);
        }
        return authorities;
	}

	@Override
	public String getPassword() {
		return getSenha();
	}

	@Override
	public String getUsername() {
		return getLogin();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
