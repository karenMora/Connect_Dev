package Connect_dev.Connect.model.proyecto;


import Connect_dev.Connect.model.Archivo.Archivo;
import Connect_dev.Connect.model.persona.Persona;

import java.util.AbstractMap;

public class ProyectoEstandar implements Proyecto {
    private String nombreProyecto;
    private Persona propietario;

    public ProyectoEstandar(String nombreProyecto, Persona propietario){
        this.nombreProyecto=nombreProyecto;
        this.propietario = propietario;

    }

    @Override
    public void cambiarPropietario(Persona propietario) {

    }

    @Override
    public void agregarArchivo(Archivo archivo) {

    }

    @Override
    public void eliminarArchivo(Archivo archivo) {

    }

    @Override
    public AbstractMap<String, Archivo> getArchivos() {
        return null;
    }
}
