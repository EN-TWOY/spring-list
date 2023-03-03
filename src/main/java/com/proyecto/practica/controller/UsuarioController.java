package com.proyecto.practica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.practica.entity.UsuarioDTO;
import com.proyecto.practica.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	// injection service
	@Autowired
	private UsuarioService usuarioServi;
	
	@RequestMapping("/lista")
	public String inicio(org.springframework.ui.Model model) {

		// recuperar listado
		List<UsuarioDTO> dataUsuario = usuarioServi.listarUsuarios();

		// crear un atributo 
		model.addAttribute("listUsuario", dataUsuario);

		// return "".html
		return "usuario";
	}
}
