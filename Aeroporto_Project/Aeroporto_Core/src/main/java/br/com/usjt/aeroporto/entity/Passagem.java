package br.com.usjt.aeroporto.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Passagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1708030779262976277L;

	private Long Id;
	private Calendar dataCompra;
	private BigDecimal valorPassagem;
	private Integer assento;
	private Integer codDespachoMalas;
	private BigDecimal taxaEmbarque;
	private Integer numeroSolicitacaoPassagem;
	private Passageiro passageiro;
	private Voo voo;
	private Pagamento pagamento;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
	@Column(unique = true, nullable = false)
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
	 * @return the dataCompra
	 */
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	public Calendar getDataCompra() {
		return dataCompra;
	}

	/**
	 * @param dataCompra
	 *            the dataCompra to set
	 */
	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}

	/**
	 * @return the valorPassagem
	 */
	@Column(precision = 10, scale = 2)
	public BigDecimal getValorPassagem() {
		return valorPassagem;
	}

	/**
	 * @param valorPassagem
	 *            the valorPassagem to set
	 */
	public void setValorPassagem(BigDecimal valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	/**
	 * @return the assento
	 */
	@Column(nullable = false, length = 3)
	public Integer getAssento() {
		return assento;
	}

	/**
	 * @param assento
	 *            the assento to set
	 */
	public void setAssento(Integer assento) {
		this.assento = assento;
	}

	/**
	 * @return the codDespachoMalas
	 */
	@Column(nullable = false, length = 15)
	public Integer getCodDespachoMalas() {
		return codDespachoMalas;
	}

	/**
	 * @param codDespachoMalas
	 *            the codDespachoMalas to set
	 */
	public void setCodDespachoMalas(Integer codDespachoMalas) {
		this.codDespachoMalas = codDespachoMalas;
	}

	/**
	 * @return the taxaEmbarque
	 */
	@Column(precision = 10, scale = 2)
	public BigDecimal getTaxaEmbarque() {
		return taxaEmbarque;
	}

	/**
	 * @param taxaEmbarque
	 *            the taxaEmbarque to set
	 */
	public void setTaxaEmbarque(BigDecimal taxaEmbarque) {
		this.taxaEmbarque = taxaEmbarque;
	}

	/**
	 * @return the numeroSolicitacaoPassagem
	 */
	public Integer getNumeroSolicitacaoPassagem() {
		return numeroSolicitacaoPassagem;
	}

	/**
	 * @param numeroSolicitacaoPassagem
	 *            the numeroSolicitacaoPassagem to set
	 */
	public void setNumeroSolicitacaoPassagem(Integer numeroSolicitacaoPassagem) {
		this.numeroSolicitacaoPassagem = numeroSolicitacaoPassagem;
	}

	/**
	 * @return the passageiro
	 */
	@ManyToOne
	public Passageiro getPassageiro() {
		return passageiro;
	}

	/**
	 * @param passageiro
	 *            the passageiro to set
	 */
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	/**
	 * @return the voo
	 */
	@ManyToOne
	public Voo getVoo() {
		return voo;
	}

	/**
	 * @param voo
	 *            the voo to set
	 */
	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	/**
	 * @return the pagamento
	 */
	@OneToOne
	public Pagamento getPagamento() {
		return pagamento;
	}

	/**
	 * @param pagamento
	 *            the pagamento to set
	 */
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

}
