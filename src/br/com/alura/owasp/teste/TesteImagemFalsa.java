package br.com.alura.owasp.teste;

import java.io.IOException;

public class TesteImagemFalsa {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("cmd.exe /c cd C:\\ && rmdir imagemfalsa");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
