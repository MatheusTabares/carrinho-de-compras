package com.matheuslopes.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matheuslopes.cursomc.domain.Estado;
import com.matheuslopes.cursomc.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
	
	@Autowired
	private EstadoService estadoService;
	
	@RequestMapping(value="/nome", method=RequestMethod.GET)
	public ResponseEntity<List<Estado>>  findAllByOrderByNome(@RequestParam(value="value") String nome) {
		List<Estado> estados = estadoService.findAllByOrderByNome(nome);
		return ResponseEntity.ok().body(estados);
	}
}
