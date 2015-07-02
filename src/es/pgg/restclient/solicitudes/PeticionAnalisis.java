/**
 * 
 */
package es.pgg.restclient.solicitudes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;

import es.pgg.restclient.bean.RestFraseBean;

/**
 * @author PatxiGG
 * 
 */
public class PeticionAnalisis {

	public RestFraseBean obtenerAnalisisData(String urlSite, String frase,
			String idioma) {
		RestFraseBean fb = null;

		// generar la llamada
		// codificamos la frase 2 veces
		byte[] arraybytes = Base64.encodeBase64(frase.getBytes());
		arraybytes = Base64.encodeBase64(arraybytes);
		frase = new String(arraybytes);

		urlSite += "/RESTFreeling/rest.php/procesarFrase/" + frase + "/"
				+ idioma;
		System.out.println(urlSite);

		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet get = new HttpGet(urlSite);

			// ejecutar la llamada
			HttpResponse response = client.execute(get);

			// crear el lector del json
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getEntity().getContent()));

			// pasar el json a clase
			fb = new Gson().fromJson(rd, RestFraseBean.class);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return fb;
	}

}
