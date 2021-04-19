/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.logica;

import com.ort.agenda.dominio.Agenda;
import com.ort.agenda.dominio.Contacto;
import com.ort.agenda.dominio.TipoContacto;
import com.ort.agenda.dominio.Usuario;


/**
 *
 * @author digregor
 */
public class DatosPrueba {
    
    public static void iniciar() {
        TipoContacto t1 = new TipoContacto("Personal");
        TipoContacto t2 = new TipoContacto("Familiar");
        TipoContacto t3 = new TipoContacto("Laboral");
        FachadaServicios.getInstance().agregarTipoContacto(t1);
        FachadaServicios.getInstance().agregarTipoContacto(t2);
        FachadaServicios.getInstance().agregarTipoContacto(t3);
        
        // Maria
        Contacto c1 = new Contacto();
        c1.setNombre("Andres");
        c1.setTelefono("12345678");
        c1.setTipoContacto(t1);
        
        Contacto c2 = new Contacto();
        c2.setNombre("Pedro");
        c2.setTelefono("43224233");
        c2.setTipoContacto(t3);
        
        Agenda agendaMaria = new Agenda();
        agendaMaria.agregarContacto(c1);
        agendaMaria.agregarContacto(c2);
        
        Usuario maria = new Usuario();
        maria.setNombre("Maria");
        maria.setUsuario("maria");
        maria.setPassword("123");
        
        maria.setAgenda(agendaMaria);
         
        // Daniel
        Contacto c3 = new Contacto();
        c3.setNombre("Vanesa");
        c3.setTelefono("12345678");
        c3.setTipoContacto(t3);
        
        Contacto c4 = new Contacto();
        c4.setNombre("Norma");
        c4.setTelefono("4324433");
        c4.setTipoContacto(t2);
        
        Agenda agendaDaniel = new Agenda();
        agendaDaniel.agregarContacto(c3);
        agendaDaniel.agregarContacto(c4);
        
        Usuario daniel = new Usuario();
        daniel.setNombre("Daniel");
        daniel.setUsuario("daniel");
        daniel.setPassword("321");
        
        daniel.setAgenda(agendaDaniel);
        
        FachadaServicios.getInstance().agregarUsuario(maria);
        FachadaServicios.getInstance().agregarUsuario(daniel);
    }
}
