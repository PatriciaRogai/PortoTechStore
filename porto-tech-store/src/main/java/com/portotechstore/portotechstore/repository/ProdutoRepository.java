package com.portotechstore.portotechstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portotechstore.portotechstore.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long>{

	public List<ProdutoModel>findAllByNomeContainingIgnoreCase(String nome); //cria uma lista, do tipo List, de produtos indiferente do case da String.	
	
}
