/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.utils;

import uy.edu.ort.agendaswing.dominio.Usuario;

/**
 *
 * @author matiasc
 */
public class SessionUtils {

    public static boolean checkLogin(Usuario usuario) {
        return usuario != null;
    }
}
