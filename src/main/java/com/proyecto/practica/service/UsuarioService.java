package com.proyecto.practica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.practica.entity.UsuarioDTO;
import com.proyecto.practica.repository.UsuarioRepository;

@Service
public class UsuarioService {

	// injection repository
	@Autowired
	private UsuarioRepository usuarioRepo;

	// list all users
	public List<UsuarioDTO> listarUsuarios() {
		return usuarioRepo.findAll();
	}
	
	// save and update
	

	// delete


	// search

}
