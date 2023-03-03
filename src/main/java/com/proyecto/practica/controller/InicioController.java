package com.proyecto.practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class InicioController {

	@RequestMapping("/")
	public String inicio(org.springframework.ui.Model model) {

		// return "".html
		return "index";
	}
}
