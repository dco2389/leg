package co.edu.um.leg;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 11/08/13
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 */
public class LEGTest {
    @Test
    public void testTalla() throws Exception {

    }
    @Test
    public void testInsertar() throws Exception {
        LEG<Integer> a = new LEG<Integer>();
        a.insertar(new Integer(23));
        a.insertar(new Integer(26));
        a.insertar(new Integer(28));
        System.out.println("La lista 1 es: " + a.toString());


    }
    @Test
    public void testInsertarEnFin() throws Exception {
        LEG<Integer> a = new LEG<Integer>();

        a.insertar(new Integer(23));
        a.insertar(new Integer(26));
        a.insertarEnFin(new Integer(22));
        System.out.println("La lista 2 es: " + a.toString());

    }
    @Test
    public void testEliminar() throws Exception {
        LEG<Integer> a = new LEG<Integer>();
        a.insertar(new Integer(23));
        a.insertar(new Integer(26));
        a.insertar(new Integer(28));
        a.eliminar(new Integer(23));
        System.out.println("La lista 3 es: " + a.toString());

    }
    @Test
    public void testToString() throws Exception {
        LEG<Integer> a = new LEG<Integer>();
        a.insertar(new Integer(23));
        a.insertar(new Integer(26));
        a.insertar(new Integer(28));
        System.out.println("La lista 4 es: " + a.toString());

    }
}
