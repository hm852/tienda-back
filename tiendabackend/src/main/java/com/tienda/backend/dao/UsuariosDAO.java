package com.tienda.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.backend.model.Usuarios;

public interface UsuariosDAO extends JpaRepository<Usuarios, Integer>  {

	
}
