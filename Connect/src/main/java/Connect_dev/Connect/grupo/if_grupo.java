package Connect_dev.Connect.grupo;


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
    void agregarMiembro(String miembro, String grupo);

    /**
     * Metodo con el cua se elimina un miembro de un grupo
     * @param nombre del miembro que se desea eliminar del grupo
     */
    void EliminarMiembro(String miembro, String grupo);
}