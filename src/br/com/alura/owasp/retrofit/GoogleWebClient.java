package br.com.alura.owasp.retrofit;

import java.io.IOException;

import retrofit2.Call;

public class GoogleWebClient {
	
	private static final String SECRET = "6LddPTUUAAAAAOkAx05jP2N9rIPlhf3WQHMuHMjZ";

	public void verifica(String recaptcha) throws IOException {
		
		Call<String> token = new RetrofitInicializador().getGoogleService().enviaToken(SECRET, recaptcha);
		token.execute().body();
		
	}

}
