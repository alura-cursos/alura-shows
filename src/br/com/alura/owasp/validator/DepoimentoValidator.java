package br.com.alura.owasp.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.alura.owasp.model.Depoimento;

public class DepoimentoValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Depoimento.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Depoimento depoimento=(Depoimento) target;
		String titulo = depoimento.getTitulo();
		String mensagem = depoimento.getMensagem();
		
		if(titulo.contains("<") || titulo.contains(">")) {
			errors.rejectValue("titulo", "errors.titulo");
		}
		
		if(mensagem.contains("<") || mensagem.contains(">")) {
			errors.rejectValue("mensagem", "errors.mensagem");
		}
	}

}
