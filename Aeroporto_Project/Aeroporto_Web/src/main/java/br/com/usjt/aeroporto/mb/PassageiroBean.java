package br.com.usjt.aeroporto.mb;

import static br.com.usjt.aeroporto.utils.MessageUtil.addMessageEnum;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.usjt.aeroporto.entity.FormaTratamento;
import br.com.usjt.aeroporto.entity.Passageiro;
import br.com.usjt.aeroporto.entity.TipoPassageiro;

@Component
@Scope("session")
@ManagedBean(name = "passageiroBean")
public class PassageiroBean {

	private Passageiro passageiro = new Passageiro();

	/**
	 * @return the passageiro
	 */

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

	public List<SelectItem> getFormaTratamento() {

		List<SelectItem> listFormaTratamento = new ArrayList<SelectItem>();

		for (FormaTratamento ft : FormaTratamento.values()) {
			listFormaTratamento.add(new SelectItem(ft.name(), addMessageEnum(ft.name())));
		}
		return listFormaTratamento;
	}

	public List<SelectItem> getTipoPassageiro() {
		List<SelectItem> listTipoPassageiro = new ArrayList<SelectItem>();
		for (TipoPassageiro ft : TipoPassageiro.values()) {
			listTipoPassageiro.add(new SelectItem(ft.name(), addMessageEnum(ft.name())));
		}
		return listTipoPassageiro;
	}

	public void clean() {
		this.passageiro = new Passageiro();
	}

	public void salvaPassageiro() {

	}

}
