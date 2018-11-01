package Connect_dev.Connect.model.grupo;

import Connect_dev.Connect.model.persona.Persona;
import Connect_dev.Connect.model.proyecto.Proyecto;

import java.util.AbstractMap;
import java.util.HashMap;

public interface Grupo {

    /**
     * Metodo con el cual se agrega una persona al grupo
     * @param usuario hace referencia a la persona que se quiere agregar
     */
    void agregarMiembro(Persona usuario);

    /**
     * Metodo con el cua se elimina un miembro del grupo
     * @param usuario hace referencia a la persona que se quiere eliminar
     */
    void eliminarMiembro(String usuario);

    /**
     * Metodo con e cual se agrega un proyecto al grupo
     * @param proyecto hace referencia al proyecto que se quiere agregar
     */
    void agregarProyecto(Proyecto proyecto);
    /**
     *
     * @param proyecto hace referencia al proyecto que se quiere eliminar
     * @param persona hace referencia a la persona que quiere eliminar y esta debe ser el propietario del proyecto
     */
    void eliminarProyecto(String proyecto, Persona persona);

    /**
     * Metodo con el que se obtiene los miembros de un grupo
     * @return un Map con llave el usuario de cada miembro
     */
    AbstractMap<String, Persona> getMiembros();

    /**
     * Metodo con el que se obtienen todos los proyectos asociados a un grupo
     * @return un Map con llave el nombre de cada Grupo
     */
    AbstractMap<String, Proyecto> getProyecto();
}
