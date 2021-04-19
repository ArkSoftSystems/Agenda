/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.dominio;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author digregor
 */
public class Agenda {

    private Set<Contacto> contactos;

    public Agenda() {
        contactos = new LinkedHashSet<>();
    }

    public boolean agregarContacto(Contacto contacto) {
        if (contacto.validar()) {
            return contactos.add(contacto);
        }
        return false;
    }

    public ArrayList<Contacto> buscarContactos(String criterio) {
        ArrayList<Contacto> contactosFiltrados = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.contains(criterio)) {
                contactosFiltrados.add(contacto);
            }
        }
        return contactosFiltrados;
    }

    public int getCantidadConcactos() {
        return contactos.size();
    }

    public Set<Contacto> getContactos() {
        return contactos;
    }
}
