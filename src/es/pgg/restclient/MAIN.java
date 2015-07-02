package es.pgg.restclient;

import es.pgg.restclient.bean.RestFraseBean;
import es.pgg.restclient.solicitudes.PeticionAnalisis;

public class MAIN {

	public static void main(String[] args) {

		String frase =
		// "Me pica la cabeza.";
		"Me gusta la leche.";
		String idioma =
		// "es";
		"es";

		String urlSite = "http://s3lab.deusto.es/wp-content/plugins";

		// peticion de tokens
		RestFraseBean fb = new PeticionAnalisis().obtenerAnalisisData(urlSite,
				frase, idioma);

		System.out.println(fb.toString());

		System.out.println("FIN");

	}
}
