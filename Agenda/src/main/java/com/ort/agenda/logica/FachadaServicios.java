/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.ort.agendaswing.logica;

import java.util.ArrayList;
import uy.edu.ort.agendaswing.dominio.TipoContacto;
import uy.edu.ort.agendaswing.dominio.Usuario;

/**
 *
 * @author digregor
 */
public class FachadaServicios {

    private static FachadaServicios instance; 
    private ServicioAgenda servicioAgenda;
    private ServicioUsuario servicioUsuario;
    
    private FachadaServicios() {
        servicioAgenda = new ServicioAgenda();
        servicioUsuario = new ServicioUsuario();
    }

    public synchronized static FachadaServicios getInstance() {
        if(instance == null) {
            instance =  new FachadaServicios();
        }
        return instance;
    }
    
    public void agregarTipoContacto(TipoContacto tipoContacto) {
        servicioAgenda.agregarTipoContacto(tipoContacto);
    }

    public ArrayList<TipoContacto> getTiposContacto() {
        return servicioAgenda.getTiposContacto();
    }

    public void agregarUsuario(Usuario usuario) {
        servicioUsuario.agregarUsuario(usuario);
    }

    public Usuario login(String usuario, String password) {
        return servicioUsuario.login(usuario, password);
    }
}
