package Connect_dev.Connect.model.persona;

/**
 *
 * @author xra
 */
public class PersonEstandar implements Persona{
    private String nombre;
    private String correo;
    private String usuario;
    private String clave;

    /**
     *
     * @param nombre hace referencia al nombre de la persona
     * @param correo hace referencia al correo y debe tener una estructur XXXX@XXX.XXX
     * @param usuario hace referencia al usuario y no puede contener caracteres especiales
     * @param clave hace referencia al valor hash de la contraseña con contraseña minima de 8 caracteres
     */
    public PersonEstandar(String nombre, String correo, String usuario, String clave){
        this.nombre=nombre;
        this.correo=correo;
        this.usuario=usuario;
        this.clave=clave;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
