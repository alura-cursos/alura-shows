package br.com.alura.owasp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.alura.owasp.dao.UsuarioDao;
import br.com.alura.owasp.model.Usuario;

@Controller
public class AdminController {
	
	@Autowired
	private UsuarioDao dao;

	@RequestMapping("/admin")
	public String admin(Model model){
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "admin";
	}
	
	@RequestMapping(value="/loginAdmin", method=RequestMethod.POST)
	public String loginAdmin(@ModelAttribute("usuario") Usuario usuario,RedirectAttributes redirect){
		boolean verificaSeUsuarioEhAdmin = dao.verificaSeUsuarioEhAdmin(usuario);
		if(verificaSeUsuarioEhAdmin){
			return "adminLogado";
		}else{
			redirect.addFlashAttribute("mensagem", "Permissão negada!");
			return "redirect:/admin";
		}
	}
	
}
