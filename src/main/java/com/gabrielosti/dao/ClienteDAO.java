/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielosti.dao;

import com.gabrielosti.model.Cliente;

/**
 *
 * @author gabriel osti
 */
public interface ClienteDAO extends DAO<Cliente, Long> {

    Cliente findByNome(String nome);

    Cliente findByEndereco(String endereco);
    
}
