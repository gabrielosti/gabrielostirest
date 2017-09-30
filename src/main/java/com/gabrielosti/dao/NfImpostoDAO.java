/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielosti.dao;

import com.gabrielosti.model.NfImposto;

/**
 *
 * @author gabriel osti
 */
public interface NfImpostoDAO extends DAO<NfImposto, Long> {

    NfImposto findByValorImposto(float valorImposto);

    NfImposto findByValorIcms(float valorIcms);

}
