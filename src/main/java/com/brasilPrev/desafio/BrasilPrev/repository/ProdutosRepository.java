package com.brasilPrev.desafio.BrasilPrev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brasilPrev.desafio.BrasilPrev.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, String> {

}
