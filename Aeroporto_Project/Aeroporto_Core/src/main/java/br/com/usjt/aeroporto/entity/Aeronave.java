package br.com.usjt.aeroporto.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Aeronave implements Serializable {

	private static final long serialVersionUID = -5552083734025912959L;

	@Id
	@GeneratedValue
	private Long id;
	@NotBlank
	private String nome;
	@NotNull
	private Integer quantidadeAssentos;
	@OneToMany(mappedBy = "aeronave", fetch = FetchType.EAGER)
	private List<Voo> listVoos;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the quantidadeAssentos
	 */
	public Integer getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	/**
	 * @param quantidadeAssentos
	 *            the quantidadeAssentos to set
	 */
	public void setQuantidadeAssentos(Integer quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}

	/**
	 * @return the listVoos
	 */
	public List<Voo> getListVoos() {
		return listVoos;
	}

	/**
	 * @param listVoos
	 *            the listVoos to set
	 */
	public void setListVoos(List<Voo> listVoos) {
		this.listVoos = listVoos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listVoos == null) ? 0 : listVoos.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((quantidadeAssentos == null) ? 0 : quantidadeAssentos.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Aeronave)) {
			return false;
		}
		Aeronave other = (Aeronave) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (listVoos == null) {
			if (other.listVoos != null) {
				return false;
			}
		} else if (!listVoos.equals(other.listVoos)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (quantidadeAssentos == null) {
			if (other.quantidadeAssentos != null) {
				return false;
			}
		} else if (!quantidadeAssentos.equals(other.quantidadeAssentos)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aeronave [id=" + id + ", nome=" + nome + ", quantidadeAssentos=" + quantidadeAssentos + ", listVoos=" + listVoos + "]";
	}
}
