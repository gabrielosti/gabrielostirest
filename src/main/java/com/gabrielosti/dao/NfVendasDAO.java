/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielosti.dao;

import com.gabrielosti.model.NfVendas;
import java.util.Date;

/**
 *
 * @author gabriel osti
 */
public interface NfVendasDAO extends DAO<NfVendas, Long> {

    NfVendas findByNfVendas(Date dt_venda);

}
