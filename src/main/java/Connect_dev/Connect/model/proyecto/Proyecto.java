package Connect_dev.Connect.model.proyecto;

import Connect_dev.Connect.model.persona.Persona;
import Connect_dev.Connect.model.Archivo.Archivo;

import java.util.AbstractMap;

public interface Proyecto {
    void cambiarPropietario(Persona propietario);
    void agregarArchivo(Archivo archivo);
    void eliminarArchivo(Archivo archivo);
    AbstractMap<String, Archivo> getArchivos();


}
