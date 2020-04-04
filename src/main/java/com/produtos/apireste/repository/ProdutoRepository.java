package com.produtos.apireste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apireste.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);
}
