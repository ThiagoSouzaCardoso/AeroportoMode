package br.com.usjt.aeroporto.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5722291357307087793L;

	@Id
	@GeneratedValue
	private Long id;
	private Long cpfResponsavel;
	private BigDecimal valorTotal;
	private Calendar dataPagamento;

	@OneToOne
	private Passagem passagem;

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
	 * @return the cpfResponsavel
	 */
	public Long getCpfResponsavel() {
		return cpfResponsavel;
	}

	/**
	 * @param cpfResponsavel
	 *            the cpfResponsavel to set
	 */
	public void setCpfResponsavel(Long cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}

	/**
	 * @return the valorTotal
	 */
	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal
	 *            the valorTotal to set
	 */
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the dataPagamento
	 */
	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	/**
	 * @param dataPagamento
	 *            the dataPagamento to set
	 */
	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	/**
	 * @return the passagem
	 */
	public Passagem getPassagem() {
		return passagem;
	}

	/**
	 * @param passagem the passagem to set
	 */
	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}

}
