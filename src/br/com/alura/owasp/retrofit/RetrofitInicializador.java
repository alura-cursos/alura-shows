package br.com.alura.owasp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInicializador {

	private static final String BASE_URL = "https://www.google.com/recaptcha/api/";
	private Retrofit retrofit;

	public RetrofitInicializador() {
		retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
	}

	public GoogleService getGoogleService() {
		return retrofit.create(GoogleService.class);		
	}

}
