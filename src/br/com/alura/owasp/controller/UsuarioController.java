package br.com.alura.owasp.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.alura.owasp.dao.UsuarioDao;
import br.com.alura.owasp.model.Usuario;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioDao dao;

	@RequestMapping("/usuario")
	public String usuario(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "usuario";
	}

	@RequestMapping("/registrar")
	public String registrar(@ModelAttribute("usuario") Usuario usuario,
			RedirectAttributes redirect, HttpServletRequest request, Model model) {
		chamaLogicaParaTratarImagem(usuario, request);
		dao.salva(usuario);
		model.addAttribute("usuario", usuario);
		return "usuarioLogado";

	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute("usuario") Usuario usuario, RedirectAttributes redirect, Model model){
		Usuario usuarioRetornado = dao.procuraUsuario(usuario);
		if(usuarioRetornado==null){
			redirect.addFlashAttribute("mensagem",
					"Usuário não encontrado!");
			return "redirect:/usuario";
		}else{
			model.addAttribute("usuario", usuarioRetornado);
			return "usuarioLogado";
		}
	}

	private void chamaLogicaParaTratarImagem(Usuario usuario,
			HttpServletRequest request) {
		usuario.setNomeImagem(usuario.getImagem().getOriginalFilename());
		File imageFile = new File(request.getServletContext().getRealPath(
				"/image"), usuario.getNomeImagem());
		try {
			usuario.getImagem().transferTo(imageFile);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
