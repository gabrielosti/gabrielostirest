/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielosti.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabriel osti
 */
@Entity
@Table(name = "nfvendas")
@XmlRootElement(name = "nfvenda")
public class NfVendas extends AbstractEntity {

    @Column(nullable = false)
    private Date dt_venda;

    @OneToMany(cascade = CascadeType.ALL)
    private List<NfVendas> nfvenda;

    @Override
    public void updateParameters(Object entity) {

    }
}
