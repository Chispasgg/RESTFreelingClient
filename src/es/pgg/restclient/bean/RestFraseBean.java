package es.pgg.restclient.bean;

/**
 * @author PatxiGG
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RestFraseBean {

	private String frase;
	private List<RestTernaBean> listaTernas;
	private List<String> listaRespuestas;

	public RestFraseBean(String frase) {
		this.setFrase(frase.toUpperCase());
		this.setListaTernas(new ArrayList<RestTernaBean>());
		this.setListaRespuestas(new ArrayList<String>());
	}

	public List<RestTernaBean> getListaTernas() {
		return this.listaTernas;
	}

	public String getFrase() {
		return this.frase;
	}

	public void addTerna(RestTernaBean terna) {
		this.listaTernas.add(terna);
	}

	public int getSize() {
		int size = 0;
		if (this.listaTernas != null) {
			size = this.listaTernas.size();
		}
		return size;
	}

	public String toString() {
		String resultado = "Frase: " + this.frase + " [size:" + this.getSize()
				+ "]\n";
		// ============================
		Iterator<RestTernaBean> it = this.listaTernas.iterator();
		while (it.hasNext()) {
			RestTernaBean ternaBean = it.next();
			resultado = resultado + ternaBean.toString()
					+ "\n-----------------------------\n";
		}
		// ============================
		return resultado;
	}

	public void addRespuesta(String respuesta) {
		respuesta = new String((respuesta.trim()).toLowerCase());
		if (!this.listaRespuestas.contains(respuesta)) {
			this.listaRespuestas.add(respuesta);
		}
	}

	public List<String> getListaRespuestas() {
		return this.listaRespuestas;
	}

	// ======================================
	private void setListaTernas(List<RestTernaBean> listaTernas) {
		this.listaTernas = listaTernas;
	}

	private void setFrase(String frase) {
		this.frase = frase;
	}

	private void setListaRespuestas(List<String> listaRespuestas) {
		this.listaRespuestas = listaRespuestas;
	}
}
