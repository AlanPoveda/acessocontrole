package com.controleacesso.acessocontrole.repository;

import com.controleacesso.acessocontrole.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRespository extends JpaRepository<JornadaTrabalho, Long> {
}
