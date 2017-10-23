package br.com.alura.owasp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInicializador {
	
	private static final String BASE_URL = "http://www.google.com/recaptcha/api/";
	private Retrofit retrofit;

	public RetrofitInicializador() {
		retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
	}

}
