/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect_clases.Archivos;

import java.io.File;

/**
 *
 * @author miguel
 */
public class Archivos {
    
    File Archivo;
    
    public void addArchivo(String nameArch){
        Archivo arch = new Archivo(nameArch);
    }
    
    public void deleteArchivo(){
        
    }
    
    public File getArchivo(){
        return Archivo;
    }
    
}