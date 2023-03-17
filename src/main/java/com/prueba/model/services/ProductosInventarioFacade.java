/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.model.services;

import com.prueba.model.entities.ProductosInventario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LENOVO
 */
@Stateless
public class ProductosInventarioFacade extends AbstractFacade<ProductosInventario> {

    @PersistenceContext(unitName = "com.prueba_paralon_Sistem_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductosInventarioFacade() {
        super(ProductosInventario.class);
    }
    
}
