package com.matheuslopes.cursomc.reporitories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.matheuslopes.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
	@Transactional(readOnly = true)
	public List<Estado>  findAllByOrderByNome();
	
}
