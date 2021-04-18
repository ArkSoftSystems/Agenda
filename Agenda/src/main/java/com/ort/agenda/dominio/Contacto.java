/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.ort.agendaswing.dominio;

/**
 *
 * @author digregor
 */
public class Contacto {

    private String nombre;
    private String telefono;
    private TipoContacto tipoContacto;

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

}
