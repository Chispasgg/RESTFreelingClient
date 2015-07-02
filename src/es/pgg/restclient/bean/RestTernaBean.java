package es.pgg.restclient.bean;

/**
 * @author PatxiGG
 * 
 */
import java.util.Iterator;
import java.util.List;

public class RestTernaBean {

	private String palabraInicial;
	private String palabraRaiz;
	private String queEs;
	private String paraHumanosQueEs;
	private int posicion;
	// datos extra
	private String tipo;
	private String persona;
	private String genero;
	private String numero;
	private String caso;
	private String poseedor;
	private String cortes;
	private String tiempo;
	private String modo;
	private String grado;
	private String forma;
	private String funcion;
	private List<String> sentidos;
	private List<String> wsd;
	// chunk
	private String estructuraChunk;

	// dependency
	// private String

	public RestTernaBean() {

	}

	public void setPalabraInicial(String palabraInicial) {
		this.palabraInicial = palabraInicial.toUpperCase();
	}

	public String getPalabraInicial() {
		return palabraInicial;
	}

	public void setPalabraRaiz(String palabraRaiz) {
		this.palabraRaiz = palabraRaiz.toUpperCase();
	}

	public String getPalabraRaiz() {
		return palabraRaiz;
	}

	public void setQueEs(String queEs) {
		this.queEs = queEs.toUpperCase();
	}

	public String getQueEs() {
		return queEs;
	}

	public void setParaHumanosQueEs(String paraHumanosQueEs) {
		this.paraHumanosQueEs = paraHumanosQueEs.toUpperCase();
	}

	public String getParaHumanosQueEs() {
		return paraHumanosQueEs;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo.toUpperCase();
	}

	public String getTipo() {
		return tipo;
	}

	public void setPersona(String persona) {
		this.persona = persona.toUpperCase();
	}

	public String getPersona() {
		return persona;
	}

	public void setGenero(String genero) {
		this.genero = genero.toUpperCase();
	}

	public String getGenero() {
		return genero;
	}

	public void setCaso(String caso) {
		this.caso = caso.toUpperCase();
	}

	public String getCaso() {
		return caso;
	}

	public void setNumero(String numero) {
		this.numero = numero.toUpperCase();
	}

	public String getNumero() {
		return numero;
	}

	public void setPoseedor(String poseedor) {
		this.poseedor = poseedor.toUpperCase();
	}

	public String getPoseedor() {
		return poseedor;
	}

	public void setCortes(String cortes) {
		this.cortes = cortes.toUpperCase();
	}

	public String getCortes() {
		return cortes;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo.toUpperCase();
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setModo(String modo) {
		this.modo = modo.toUpperCase();
	}

	public String getModo() {
		return modo;
	}

	public void setGrado(String grado) {
		this.grado = grado.toUpperCase();
	}

	public String getGrado() {
		return grado;
	}

	public void setForma(String forma) {
		this.forma = forma.toUpperCase();
	}

	public String getForma() {
		return forma;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion.toUpperCase();
	}

	public String getFuncion() {
		return funcion;
	}

	public String toString() {
		String resultado = "\n";
		// ===============================
		if (this.getPalabraInicial() != null) {
			resultado = (resultado + " " + "Terna:" + this.getPalabraInicial() + "\n");
		}
		if (this.getQueEs() != null) {
			resultado = (resultado + " " + "que es:" + this.getQueEs() + "\n");
		}
		if (this.getParaHumanosQueEs() != null) {
			resultado = (resultado + " " + "que es para humanos:"
					+ this.getParaHumanosQueEs() + "\n");
		}
		if (this.getPalabraRaiz() != null) {
			resultado = (resultado + " " + "palabra raiz:"
					+ this.getPalabraRaiz() + "\n");
		}
		if (this.getTipo() != null) {
			resultado = (resultado + " " + "tipo:" + this.getTipo() + "\n");
		}
		if (this.getPersona() != null) {
			resultado = (resultado + " " + "persona:" + this.getPersona() + "\n");
		}
		if (this.getGenero() != null) {
			resultado = (resultado + " " + "genero:" + this.getGenero() + "\n");
		}
		if (this.getNumero() != null) {
			resultado = (resultado + " " + "numero:" + this.getNumero() + "\n");
		}
		if (this.getCaso() != null) {
			resultado = (resultado + " " + "caso:" + this.getCaso() + "\n");
		}
		if (this.getPoseedor() != null) {
			resultado = (resultado + " " + "poseedor:" + this.getPoseedor() + "\n");
		}
		if (this.getCortes() != null) {
			resultado = (resultado + " " + "cortes:" + this.getCortes() + "\n");
		}
		if (this.getTiempo() != null) {
			resultado = (resultado + " " + "tiempo:" + this.getTiempo() + "\n");
		}
		if (this.getModo() != null) {
			resultado = (resultado + " " + "modo:" + this.getModo() + "\n");
		}
		if (this.getGrado() != null) {
			resultado = (resultado + " " + "grado:" + this.getGrado() + "\n");
		}
		if (this.getForma() != null) {
			resultado = (resultado + " " + "forma:" + this.getForma() + "\n");
		}
		if (this.getFuncion() != null) {
			resultado = (resultado + " " + "funcion:" + this.getFuncion() + "\n");
		}
		if (this.getSentidos() != null) {
			Iterator<String> it = this.getSentidos().iterator();
			String sentidos = null;
			while (it.hasNext()) {
				if (sentidos == null) {
					sentidos = "" + it.next();
				} else {
					sentidos = sentidos + "-" + it.next();
				}
			}
			resultado = (resultado + " " + "sentidos:" + sentidos + "\n");
		}

		if (this.wsd != null) {
			Iterator<String> it = this.wsd.iterator();
			String wsd = null;
			while (it.hasNext()) {
				if (wsd == null) {
					wsd = "" + it.next();
				} else {
					wsd = wsd + "-" + it.next();
				}
			}
			resultado = (resultado + " " + "WSD:" + wsd + "\n");
		}
		resultado += " estructura chunk: " + this.estructuraChunk + "\n";
		// ===============================
		return resultado;
	}

	public void setSentidos(List<String> sentidos) {
		this.sentidos = sentidos;
	}

	public List<String> getSentidos() {
		return sentidos;
	}

	public List<String> getWsd() {
		return wsd;
	}

	public void setWsd(List<String> wsd) {
		this.wsd = wsd;
	}

}
