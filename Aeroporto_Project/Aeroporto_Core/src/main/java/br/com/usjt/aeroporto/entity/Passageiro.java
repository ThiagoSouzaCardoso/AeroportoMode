package br.com.usjt.aeroporto.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Passageiro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6345703297939174898L;

	private Long Id;
	private String nome;
	private String sobreNome;
	private Integer telefone;
	private String email;
	private Calendar dataNascimento = Calendar.getInstance();
	private TipoPassageiro tipoPassageiro;
	private FormaTratamento formaTratamento;
	private List<Passagem> listPassagem;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	public Long getId() {
		return Id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}

	/**
	 * @return the nome
	 */
	@NotBlank
	@Column(length = 12)
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
	 * @return the sobreNome
	 */
	@NotBlank
	@Column(length = 100)
	public String getSobreNome() {
		return sobreNome;
	}

	/**
	 * @param sobreNome
	 *            the sobreNome to set
	 */
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	/**
	 * @return the telefone
	 */
	public Integer getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the email
	 */
	@Email
	@NotBlank
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dataNascimento
	 */
	@Temporal(TemporalType.DATE)
	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the tipoPassageiro
	 */
	@Enumerated(EnumType.ORDINAL)
	public TipoPassageiro getTipoPassageiro() {
		return tipoPassageiro;
	}

	/**
	 * @param tipoPassageiro
	 *            the tipoPassageiro to set
	 */
	public void setTipoPassageiro(TipoPassageiro tipoPassageiro) {
		this.tipoPassageiro = tipoPassageiro;
	}

	/**
	 * @return the formaTratamento
	 */
	@Enumerated(EnumType.ORDINAL)
	public FormaTratamento getFormaTratamento() {
		return formaTratamento;
	}

	/**
	 * @param formaTratamento
	 *            the formaTratamento to set
	 */
	public void setFormaTratamento(FormaTratamento formaTratamento) {
		this.formaTratamento = formaTratamento;
	}

	/**
	 * @return the listPassagem
	 */
	@OneToMany(mappedBy = "passageiro")
	public List<Passagem> getListPassagem() {
		return listPassagem;
	}

	/**
	 * @param listPassagem
	 *            the listPassagem to set
	 */
	public void setListPassagem(List<Passagem> listPassagem) {
		this.listPassagem = listPassagem;
	}

}
