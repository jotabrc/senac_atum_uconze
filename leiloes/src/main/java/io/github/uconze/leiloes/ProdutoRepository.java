package io.github.uconze.leiloes;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAllByStatus(String status);
}

