package br.com.unipac.apitrabalhos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unipac.apitrabalhos.model.domain.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {
	
	Trabalho findById(long id);

}
