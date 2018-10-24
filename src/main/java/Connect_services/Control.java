/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect_services;


import Connect_clases.Grupo.Grupo;
import Connect_dev.Connect.grupo.impl.cl_grupo;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author xra
 */
@RestController
public class Control {
    
    @Autowired
    cl_grupo  main;
    
    /**
    * Metodo para el servicio de crear grupo
    */
    @PostMapping("crearGrupo")
    public void crearGrupo(){
        main.crearGrupo("grupo");
    }
    /**
     * metodo con el cual se obtienen todos los grupos
     */
    @GetMapping("getGrupos")
    public void getGrupos(){
        
    }
    
    /**
    * Metodo para el servicio agregar compañero
    */
    @PostMapping("agregarCompañero")
    public void agregarMiembro(){        
    }
    
    /**
    * Metodo para el servicio para eliminar a un compañero
    */
    @GetMapping("delete")
    public void delete(){
        //main.EliminarMiembro(miembro, grupo);
        
    }
    
        
    
}
