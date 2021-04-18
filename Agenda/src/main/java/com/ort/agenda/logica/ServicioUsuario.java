/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.ort.agendaswing.logica;

import java.util.ArrayList;
import uy.edu.ort.agendaswing.dominio.Usuario;

/**
 *
 * @author digregor
 */
public class ServicioUsuario {

    private ArrayList<Usuario> usuarios;

    public ServicioUsuario() {
        usuarios = new ArrayList<>();
    }
    
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario login(String usuario, String password) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.esPassordValida(password)) {
                return u;
            }
        }
        return null;
    }
}
