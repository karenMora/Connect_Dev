/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect_clases.Grupo;

import Connect_clases.Personas.Miembro;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author xra
 */
public class Grupo {
    private String pv_grupo;
    private HashMap<String, Miembro> miembros;
    
    public Grupo(String lv_grupo){
        pv_grupo = lv_grupo; 
        miembros = new HashMap<>();
    }
    
    public void addMiembro(Miembro miembro){
        miembros.put(miembro.getNombre(), miembro);
    }
    
    public void remMiembro(String usuario){
        if(miembros.containsKey(usuario)){
            miembros.remove(usuario);
        }else{
            
        }
    }
    
}
