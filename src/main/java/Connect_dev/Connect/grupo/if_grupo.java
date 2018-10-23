package Connect_dev.Connect.grupo;

import Connect_clases.Grupo.Grupo;
import Connect_clases.Personas.Miembro;
import java.util.HashMap;


/**
 * @author  xra
 */
public interface if_grupo {

    /**
     * Metodo con el cual se permite crear un grupo
     * @param  grupo nombre del grupo que se desea crear
     */
    void crearGrupo(String grupo);

    /**
     * Metodo con el cual se agrega un miembro al grupo
     * @param  nombre del miembro que se desea añadir al grupo
     */
    void agregarMiembro(Miembro miembro, String grupo);

    /**
     * Metodo con el cua se elimina un miembro de un grupo
     * @param nombre del miembro que se desea eliminar del grupo
     */
    void EliminarMiembro(Miembro miembro, String grupo);
    HashMap<String, Grupo> getGrupos() ;
}