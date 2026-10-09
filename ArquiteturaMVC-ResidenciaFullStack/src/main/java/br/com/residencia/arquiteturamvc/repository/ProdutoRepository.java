package br.com.residencia.arquiteturamvc.repository;

import br.com.residencia.arquiteturamvc.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}