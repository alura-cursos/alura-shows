package br.com.alura.owasp.retrofit;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GoogleService {

	@POST("siteverify")
	Call<String> enviaToken(@Query("secret") String secret, @Query("response") String response);
}
