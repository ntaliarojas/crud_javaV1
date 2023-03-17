/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.prueba.paralon_sistem;


import com.prueba.model.entities.ClienteProveedor;
import com.prueba.model.services.ClienteProveedorFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.ejb.EJB;


/**
 *
 * @author brhay
 */
@Named(value = "controllerClientes")
@SessionScoped
public class ControllerClientes implements Serializable {

    ClienteProveedor clipro = new ClienteProveedor();
    @EJB
    ClienteProveedorFacade cliproFacade;
    private List<String> tipoclientes = Arrays.asList("Natural", "Juridico");
    private List<String> roles = Arrays.asList("Cliente", "Proveedor");
    
    public ControllerClientes() {
    }
    
    //CREATE
    public void guardarCliente(){
        try{
            cliproFacade.create(clipro);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //READ
    public List<ClienteProveedor> listaClientes(){
        return cliproFacade.findAll();
    }
    //UPDATE
     public String actualizarCliente(ClienteProveedor e){
        this.clipro = e;
        return "./Actualizar/ActualizarClientes.xhtml";
    }
    
    public String actualizarCliente(){
        this.cliproFacade.edit(clipro);
        this.clipro = new ClienteProveedor();
        return "ListadeClientes.xhtml";
    }
    //DELETE    
    public void eliminarCliente(ClienteProveedor clipro){
        this.cliproFacade.remove(clipro);
    }

    public ClienteProveedor getClipro() {
        return clipro;
    }

    public void setClipro(ClienteProveedor clipro) {
        this.clipro = clipro;
    }

    public ClienteProveedorFacade getCliproFacade() {
        return cliproFacade;
    }

    public void setCliproFacade(ClienteProveedorFacade cliproFacade) {
        this.cliproFacade = cliproFacade;
    }

    public List<String> getTipoclientes() {
        return tipoclientes;
    }

    public void setTipoclientes(List<String> tipoclientes) {
        this.tipoclientes = tipoclientes;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
    
}
