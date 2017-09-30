/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielosti.dao;

import com.gabrielosti.model.ItemNf;

/**
 *
 * @author gabriel osti
 */
public interface ItemNfDAO extends DAO<ItemNf, Long> {

    ItemNf findByValorItem(float dt_venda);

    ItemNf findByQuantidade(int quantidade);

}
