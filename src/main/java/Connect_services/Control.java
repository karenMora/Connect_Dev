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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author xra
 */
@RestController
public class Control implements services{
    @Autowired
    cl_grupo  main;
    
    
    @GetMapping("grupos")
    public HashMap<String, Grupo> getGrupos(){
        return main.getGrupos();
    }
    
    @PostMapping("crearGrupo")
    public void crearGrupo(){
        
    }
    
    
        
    
}
