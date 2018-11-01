/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect_dev.Connect.model.Archivo;

import java.io.File;

/**
 *
 * @author miguel
 */
public class Archivo {
    
    File archivo;
    
    public Archivo(String nameFile){
        archivo = new File(""+nameFile+".txt");
    }
    
}
