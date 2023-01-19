package com.treina.recife.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treina.recife.model.DadosPessoais;

public interface DadosPessoaisService extends JpaRepository<DadosPessoais, Long> {

    DadosPessoais findByContatoId(long contatoId);

}
