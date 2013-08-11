package co.edu.um.leg;

/**
 * Created with IntelliJ IDEA.
 * User: Daniel
 * Date: 11/08/13
 * Time: 15:33
 * To change this template use File | Settings | File Templates.
 */
public class NodoLEG <E> {
    E dato;
    NodoLEG<E> siguiente;

    NodoLEG(E dato){
        this(dato, null);
    }
    NodoLEG(E dato, NodoLEG <E> siguiente){
            this.dato = dato;
            this.siguiente = siguiente;
        }
    }

