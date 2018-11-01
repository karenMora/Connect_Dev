package Connect_dev.Connect;

import Connect_dev.Connect.model.grupo.GrupoEstandar;
import Connect_dev.Connect.model.persona.PersonEstandar;
import Connect_dev.Connect.model.persona.Persona;
import Connect_dev.Connect.model.proyecto.Proyecto;
import Connect_dev.Connect.model.proyecto.ProyectoEstandar;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.AbstractMap;
import java.util.HashMap;

import static org.assertj.core.api.Fail.fail;


public class TestGrupoEstandar {

    Persona p,p2,p3;
    Proyecto py, py2, py3;
    GrupoEstandar grupoEstandar;

    @Before
    public void runBeforeTest(){
        p = new PersonEstandar("Rafael", "rafael.jimenez@mail.escuelaing.edu.co", "xra", "123456789");
        p2 = new PersonEstandar("Karen", "karen.mora@mail.escuelaing.edu.co", "kMora", "123456789");
        p3 = new PersonEstandar("Miguel", "miguel.rojas@mail.escuelaing.edu.co", "mRojas", "123456789");
        grupoEstandar = new GrupoEstandar("grupoDeprueba");
        py = new ProyectoEstandar("proyecto1", p);
        py2 = new ProyectoEstandar("proyecto2", p2);
        py3 = new ProyectoEstandar("proyecto3", p3 );
    }

    @After
    public void runAfterTest(){
        p  = null; p2 = null; p3 = null;
        py= null; py2= null; py3 = null;
        grupoEstandar = null;
    }

    @Test
    /**
     * prueba en la cual se debe garantizar que agrega a un miembro al grupo
     */
    public void debeAgregarUsuarios() {
        try {
            grupoEstandar.agregarMiembro(p);
            AbstractMap ans = grupoEstandar.getMiembros();
            Assert.assertTrue(((HashMap) ans).size() == 1);
        }catch (Exception e){
            fail("ha fallado el metodo");
        }
    }

    @Test
    /**
     * Prueba con la cual se garantiza que no se agreguen repetidos al grupo
     */
    public void noDebeAgregarRepetidos() {
        try {
            grupoEstandar.agregarMiembro(p);
            grupoEstandar.agregarMiembro(p);
            AbstractMap ans = grupoEstandar.getMiembros();
            Assert.assertTrue(((HashMap) ans).size() == 1);
        } catch (Exception e) {
            fail("ha fallado el metodo");
        }
    }

    @Test
    /**
     * Prueba con el cual se garantiza que se elimina un miembro
     */
    public void debeEliminarUnMimebro(){
        try {
            grupoEstandar.agregarMiembro(p);
            grupoEstandar.agregarMiembro(p2);
            grupoEstandar.agregarMiembro((p3));
            AbstractMap ans = grupoEstandar.getMiembros();
            Assert.assertTrue(((HashMap) ans).size() == 3);
            grupoEstandar.eliminarMiembro("xra");
            ans = grupoEstandar.getMiembros();
            Assert.assertTrue(((HashMap) ans).size() == 2);
        }catch (Exception e){
            fail("ha fallado el metodo");
        }
    }

    @Test
    /**
     * Prueba con la que se garantiza que se agrega un proyecto
     */
    public void debeAgregarUnProyecto() {
        try {
            grupoEstandar.agregarProyecto(py);
            AbstractMap ans = grupoEstandar.getProyecto();
            Assert.assertTrue(((HashMap) ans).size() == 1);
        } catch (Exception e) {
            fail("ha fallado el metodo");
        }
    }

    @Test
    /**
     * Prueba con la cual se garantiza que no se agrega un proyecto con el mismo nombre
     */
    public void noDebeAgregarProyectoConElMismoNombre(){
        try{
            grupoEstandar.agregarProyecto(py);
            grupoEstandar.agregarProyecto(py);
            AbstractMap ans = grupoEstandar.getProyecto();
            Assert.assertTrue(((HashMap) ans).size() == 1);
        }catch (Exception e){
            fail("ha fallado el metodo");
        }}

    @Test
    /**
     * Prueba con la cual se garantiza que se elimina un proyecto
     */
    public void debeEliminarUnProyecto(){
        try {
            grupoEstandar.agregarProyecto(py);
            grupoEstandar.agregarProyecto(py2);
            grupoEstandar.agregarProyecto(py3);
            AbstractMap ans = grupoEstandar.getProyecto();
            Assert.assertTrue(ans.size()==3);
            grupoEstandar.eliminarProyecto("proyecto1", p);
        }catch (Exception e){
            fail("ha fallado el metodo");
        }
    }
}
