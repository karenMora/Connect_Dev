/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect_dev.Connect.model.archivo;

import java.io.File;
import java.util.HashMap;

/**
 *
 * @author miguel
 */
public class Archivos {
    
    File Archivo;
    private HashMap<String,Archivo> archivos;
    
    public Archivos(){
        archivos = new HashMap<>();
    }
    
    public void addArchivo(String nameArch){
        Archivo arch = new Archivo(nameArch);
        try {
            archivos.put(nameArch, new Archivo(nameArch));
        } catch (Exception e) {
        } 
    }
    
    public void deleteArchivo(){
        
    }
    public void deleteArchivo (Archivo archivo, String archiv) {
        try {
            archivos.remove(archiv);
        } catch (Exception e) {
        }
    }
    
    public File getArchivo(){
        return Archivo;
    }
    
}
