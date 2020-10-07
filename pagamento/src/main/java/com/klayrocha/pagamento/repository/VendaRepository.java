package com.klayrocha.pagamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klayrocha.pagamento.entity.Venda;

@Repository
public interface VendaRepository  extends JpaRepository<Venda, Long>{

}
