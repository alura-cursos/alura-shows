package br.com.alura.owasp.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInicializador {

	private static final String BASE_URL = "https://www.google.com/recaptcha/api/";
	private Retrofit retrofit;

	public RetrofitInicializador() {
		
		HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
		interceptor.setLevel(Level.BODY);
		
		Builder client = new OkHttpClient.Builder();
		client.addInterceptor(interceptor);
		
		retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
				.client(client.build())
				.build();
	}

	public GoogleService getGoogleService() {
		return retrofit.create(GoogleService.class);
	}

}
