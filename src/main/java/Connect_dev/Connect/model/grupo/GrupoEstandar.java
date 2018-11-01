package Connect_dev.Connect.model.grupo;

import Connect_dev.Connect.model.persona.Persona;
import Connect_dev.Connect.model.proyecto.Proyecto;

import java.util.AbstractMap;
import java.util.HashMap;

public class GrupoEstandar implements Grupo {
    private String nombreGrupo;
    private HashMap<String, Persona> miembros;
    private HashMap<String, Object> proyectos;

    public GrupoEstandar(String nombreGrupo){
        this.nombreGrupo = nombreGrupo;
        miembros = new HashMap<>();
    }

    @Override
    /**
     * Metodo con el cual se agrega una persona al grupo
     * @param usuario hace referencia a la persona que se quiere agregar
     */
    public void agregarMiembro(Persona usuario) {
        if(!miembros.containsKey(usuario.getUser())) {
            miembros.put(usuario.getUser(), usuario);
        }
    }

    @Override
    /**
     * Metodo con el cua se elimina un miembro del grupo
     * @param usuario hace referencia a la persona que se quiere eliminar
     */
    public void eliminarMiembro(String usuario) {
        if(miembros.containsKey(usuario)){
            miembros.remove(usuario);
        }


    }

    @Override
    /**
     * Metodo con e cual se agrega un proyecto al grupo
     * @param proyecto hace referencia al proyecto que se quiere agregar
     */
    public void agregarProyecto(Proyecto proyecto) {
        //TODO
    }

    @Override
    /**
     *
     * @param proyecto hace referencia al proyecto que se quiere eliminar
     * @param persona hace referencia a la persona que quiere eliminar y esta debe ser el propietario del proyecto
     */
    public void eliminarProyecto(String proyecto, Persona persona) {
        //TODO
    }

    @Override
    /**
     * Metodo con el que se obtiene los miembros de un grupo
     * @return un Map con llave el usuario de cada miembro
     */
    public HashMap<String, Persona> getMiembros() {
        return miembros;
    }

    @Override
    /**
     * Metodo con el que se obtienen todos los proyectos asociados a un grupo
     * @return un Map con llave el nombre de cada Grupo
     */
    public AbstractMap<String, Proyecto> getProyecto() {
        //TODO
        return null;
    }
}
