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
    public void agregarMiembro(Persona usuario) {
        miembros.put(usuario.getUser(), usuario);
    }

    @Override
    public void eliminarMiembro(String usuario) {
        miembros.remove(usuario);

    }

    @Override
    public void agregarProyecto(Proyecto proyecto) {
        //TODO
    }

    @Override
    public void eliminarProyecto(String proyecto, Persona persona) {
        //TODO
    }

    @Override
    public HashMap<String, Persona> getMiembros() {
        return miembros;
    }

    @Override
    public AbstractMap<String, Proyecto> getProyecto() {
        return null;
    }
}
