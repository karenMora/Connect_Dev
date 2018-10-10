/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect_clases.Grupo;

import Connect_clases.Personas.Miembro;
import java.util.HashMap;

/**
 *
 * @author xra
 */
public class Grupo {
    private String pv_grupo;
    private HashMap<String, Miembro> miembros;
    
    /**
     * 
     * @param lv_grupo debe ser el nombre que se le desea dar al grupo
     */
    public Grupo(String lv_grupo){
        pv_grupo = lv_grupo; 
        miembros = new HashMap<>();
    }
    /**
     * funcion con la cual se añade un miembro a un grupo
     * @param miembro debe ser el miembro que se desea añadir al grupo
     * @throws debe arrojar una excecpion si el miembro que se desea añadir ya pertenece al grupo
     */
    public void addMiembro(Miembro miembro){
        miembros.put(miembro.getNombre(), miembro);
    }
    /**
     * funcion con la cual se elimina un miembro del grupo
     * @param usuario debe ser el miembro que se desea eliminar
     * @throws debe arrojar una excepcion si el mimebro que se desea eliminar no pertenece al grupo
     */
    public void remMiembro(Miembro usuario){
        if(miembros.containsKey(usuario)){
            miembros.remove(usuario);
        }else{
            
        }
    }

    
}
