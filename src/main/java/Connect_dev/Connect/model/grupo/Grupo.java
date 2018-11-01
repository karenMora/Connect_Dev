package Connect_dev.Connect.model.grupo;

import Connect_dev.Connect.model.persona.Persona;
import Connect_dev.Connect.model.proyecto.Proyecto;

import java.util.AbstractMap;
import java.util.HashMap;

public interface Grupo {

    void agregarMiembro(Persona usuario);
    void eliminarMiembro(String usuario);
    void agregarProyecto(Proyecto proyecto);
    void eliminarProyecto(String proyecto, Persona persona);
    AbstractMap<String, Persona> getMiembros();
    AbstractMap<String, Proyecto> getProyecto();
}
