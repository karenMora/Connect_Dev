/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect_dev.Connect.grupo.impl;

import Connect_clases.Grupo.Grupo;
import Connect_clases.Personas.Miembro;
import Connect_dev.Connect.grupo.if_grupo;
import java.util.HashMap;

/**
 *
 * @author xra
 */
public class cl_grupo implements if_grupo {
    private HashMap<String,Grupo> grupos;
    
    public cl_grupo(){
        grupos = new HashMap<>();
    }
    @Override
    public void crearGrupo(String grupo) {
        try {
            grupos.put(grupo, new Grupo(grupo));
        } catch (Exception e) {
        }   
    }
    @Override
    public void agregarMiembro(Miembro miembro, String grupo) {
        try {
            grupos.get(grupo).addMiembro(miembro);
        }catch (Exception e){
        }
    }
    @Override
    public void EliminarMiembro(Miembro miembro,String grupo) {
        try {
            grupos.get(grupo).remMiembro(miembro);
        } catch (Exception e) {
        }
    }
}
