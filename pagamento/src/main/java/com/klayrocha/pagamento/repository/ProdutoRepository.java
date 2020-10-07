package com.klayrocha.pagamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klayrocha.pagamento.entity.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
