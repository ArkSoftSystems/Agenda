/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.ort.agendaswing.dominio;

import java.util.ArrayList;

/**
 *
 * @author digregor
 */
public class Agenda {
    
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }
   
    public int getCantidadConcactos() {
        return contactos.size();
    }
    
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
}
