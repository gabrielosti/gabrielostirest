/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabrielosti.model;

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
@Table(name = "itemnfs")
@XmlRootElement(name = "itemnf")
public class ItemNf extends AbstractEntity {

    @Column(nullable = false)
    private float valorItem;

    @Column(nullable = false)
    private int quantidade;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ImpostoItem> impostoItem;

    @Override
    public void updateParameters(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
