/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.prueba.paralon_sistem;

import com.prueba.model.entities.Empleados;
import com.prueba.model.entities.SalidaInventario;
import com.prueba.model.services.EmpleadosFacade;
import com.prueba.model.services.SalidaInventarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author LENOVO
 */
@Named(value = "controllerSalida")
@SessionScoped
public class controllerSalida implements Serializable {

    @EJB
    private SalidaInventarioFacade salidaFacade;
    private SalidaInventario salida = new SalidaInventario();
    
    @EJB
    private EmpleadosFacade empleadosFacade;
    private Empleados empleados = new Empleados();
    /**
     * Creates a new instance of controllerSalida
     */
    public controllerSalida() {
    }

    //GUARDAR
    public void guardar(){
        try{
            salida.setIdEmpleadoSal(empleadosFacade.find(empleados.getIdEmpleados()));
            salidaFacade.create(salida);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    ///LISTAR
    public List<SalidaInventario> getAllSalidaInventario(){
        return salidaFacade.findAll();
    }
    //ELIMINAR
    public void eliminar(SalidaInventario salida){
        salidaFacade.remove(salida);
    }
    /**
     * @return the salidaFacade
     */
    public SalidaInventarioFacade getSalidaFacade() {
        return salidaFacade;
    }

    /**
     * @param salidaFacade the salidaFacade to set
     */
    public void setSalidaFacade(SalidaInventarioFacade salidaFacade) {
        this.salidaFacade = salidaFacade;
    }

    /**
     * @return the salida
     */
    public SalidaInventario getSalida() {
        return salida;
    }

    /**
     * @param salida the salida to set
     */
    public void setSalida(SalidaInventario salida) {
        this.salida = salida;
    }

    /**
     * @return the empleadosFacade
     */
    public EmpleadosFacade getEmpleadosFacade() {
        return empleadosFacade;
    }

    /**
     * @param empleadosFacade the empleadosFacade to set
     */
    public void setEmpleadosFacade(EmpleadosFacade empleadosFacade) {
        this.empleadosFacade = empleadosFacade;
    }

    /**
     * @return the empleados
     */
    public Empleados getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }
    
}
