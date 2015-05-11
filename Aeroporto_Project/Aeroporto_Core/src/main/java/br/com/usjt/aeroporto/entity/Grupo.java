package br.com.usjt.aeroporto.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "ROLE")
public class Grupo {

	@Id
	@GeneratedValue
    @Column(name = "role_id")
	private Long id;
	private String nome;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "role_permission", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private Set<Direito> direitos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public Set<Direito> getDireitos() {
        return direitos;
    }

    public void setDireitos(Set<Direito> direitos) {
        this.direitos = direitos;
    }

}
