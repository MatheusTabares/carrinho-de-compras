package com.matheuslopes.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheuslopes.cursomc.domain.Estado;
import com.matheuslopes.cursomc.reporitories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	 public List<Estado> findAllByOrderByNome() {
		 return estadoRepository.findAllByOrderByNome();
	 }
	
}
