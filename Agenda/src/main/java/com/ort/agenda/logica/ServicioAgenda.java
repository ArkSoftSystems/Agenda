/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.logica;

import com.ort.agenda.dominio.TipoContacto;
import java.util.ArrayList;

/**
 *
 * @author digregor
 */
public class ServicioAgenda {

    private ArrayList<TipoContacto> tiposContacto;

    public ServicioAgenda() {
        tiposContacto = new ArrayList<>();
    }
    
    public void agregarTipoContacto(TipoContacto tipoContacto) {
        tiposContacto.add(tipoContacto);
    }

    public ArrayList<TipoContacto> getTiposContacto() {
        return tiposContacto;
    }
}
