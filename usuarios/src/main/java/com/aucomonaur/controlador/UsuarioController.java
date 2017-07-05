package com.aucomonaur.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aucomonaur.modelo.Usuario;
import com.aucomonaur.repositorio.RepositorioUsuarios;

@RestController
@RequestMapping(value="/")
public class UsuarioController {

	@Autowired
	RepositorioUsuarios repositorioUsuarios;
	
	@GetMapping(value="/lista")
	public List<Usuario> getAll(){
		return repositorioUsuarios.findAll();
	}
}
