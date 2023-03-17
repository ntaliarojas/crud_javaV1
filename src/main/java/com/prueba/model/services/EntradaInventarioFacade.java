/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.model.services;

import com.prueba.model.entities.EntradaInventario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LENOVO
 */
@Stateless
public class EntradaInventarioFacade extends AbstractFacade<EntradaInventario> {

    @PersistenceContext(unitName = "com.prueba_paralon_Sistem_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntradaInventarioFacade() {
        super(EntradaInventario.class);
    }
    
}
