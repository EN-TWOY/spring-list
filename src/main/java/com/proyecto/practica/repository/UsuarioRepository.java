package com.proyecto.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.practica.entity.UsuarioDTO;

public interface UsuarioRepository extends JpaRepository<UsuarioDTO, Integer>{

}
