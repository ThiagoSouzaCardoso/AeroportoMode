package br.com.usjt.aeroporto.utils;

import java.util.Map;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class MessageUtil {

	public static String getRequestParameter(String name) {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(name);
	}

	public static void addMessage(String key, String title, Severity type) {
		currentInstanceUtil().addMessage(null, new FacesMessage(type, bundleName(title), bundleName(key)));
	}

	public static String addMessageEnum(String key) {
		return bundleName(key);
	}

	private static String bundleName(String key) {
		String bundleName = "br.com.usjt.aeroporto.mensagens.Resources";
		return bundleMessage(bundleName).getString(key);
	}

	private static ResourceBundle bundleMessage(String bundleName) {
		return ResourceBundle.getBundle(bundleName, currentInstanceUtil().getViewRoot().getLocale());
	}

	public static void exibirMensagemSucesso(String mensagem) {
		exibirMensagem(FacesMessage.SEVERITY_INFO, mensagem);
	}

	public static void exibirMensagemAlerta(String mensagem) {
		exibirMensagem(FacesMessage.SEVERITY_WARN, mensagem);
	}

	public static void exibirMensagemErro(String mensagem) {
		exibirMensagem(FacesMessage.SEVERITY_ERROR, mensagem);
	}

	private static void exibirMensagem(FacesMessage.Severity severity, String mensagem) {
		FacesMessage facesMessage = new FacesMessage(severity, "", mensagem);
		currentInstanceUtil().addMessage(null, facesMessage);
	}

	public static ExternalContext getExternalContext() {
		return currentInstanceUtil().getExternalContext();
	}

	public static FacesContext currentInstanceUtil() {
		return FacesContext.getCurrentInstance();
	}

	public static Map<?, ?> getSessionMap() {
		return FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	}

}
