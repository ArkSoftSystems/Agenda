/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.dominio;

/**
 *
 * @author digregor
 */
public class Usuario {

    private String usuario;

    private String nombre;

    private String password;

    private Agenda agenda;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean esPassordValida(String password) {
        return this.password.equals(password);
    }
}
