/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.dominio;

import java.util.Objects;

/**
 *
 * @author digregor
 */
public class Contacto {

    private String nombre;
    private String telefono;
    private TipoContacto tipoContacto;

    public boolean contains(String criterio) {
        return telefono.contains(criterio) || nombre.contains(criterio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(TipoContacto tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    @Override
    public String toString() {
        return nombre + ", " + telefono + ", " + tipoContacto.getNombre();
    }

    public boolean validar() {
        return !nombre.trim().isBlank() && !telefono.trim().isBlank() && tipoContacto != null;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.tipoContacto, other.tipoContacto)) {
            return false;
        }
        return true;
    }

}
