package br.com.usjt.aeroporto.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Voo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5159479661976722552L;

	@Id
	@GeneratedValue
	private Long Id;
	private String destino;
	private String origem;
	private Calendar dataPartida;
	private String status;
	private Integer escalas;
	@ManyToOne
	private Aeronave aeronave;

	@OneToMany(mappedBy = "voo")
	private List<Passagem> listPassagem;

	/**
	 * @return the id
	 */
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
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * @param destino
	 *            the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @return the origem
	 */
	public String getOrigem() {
		return origem;
	}

	/**
	 * @param origem
	 *            the origem to set
	 */
	public void setOrigem(String origem) {
		this.origem = origem;
	}

	/**
	 * @return the dataPartida
	 */
	public Calendar getDataPartida() {
		return dataPartida;
	}

	/**
	 * @param dataPartida
	 *            the dataPartida to set
	 */
	public void setDataPartida(Calendar dataPartida) {
		this.dataPartida = dataPartida;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the escalas
	 */
	public Integer getEscalas() {
		return escalas;
	}

	/**
	 * @param escalas
	 *            the escalas to set
	 */
	public void setEscalas(Integer escalas) {
		this.escalas = escalas;
	}

	/**
	 * @return the aeronave
	 */
	public Aeronave getAeronave() {
		return aeronave;
	}

	/**
	 * @param aeronave
	 *            the aeronave to set
	 */
	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}

	/**
	 * @return the listPassagem
	 */
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
